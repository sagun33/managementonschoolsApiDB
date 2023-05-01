package stepdefinitions.API.US05;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import pojos.DeanRequestPojo;
import pojos.DeanRespponsePojo;

import static base_urls.ManagementOnSchoolBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US05_Put_Dean {
    Response response;
    DeanRequestPojo saveDean;
    DeanRespponsePojo expectedData;
    Faker faker = new Faker();
    int userId=239;
    @Given("Admin Put Request yapar")
    public void admin_put_request_yapar() {
        //set the url
        spec.pathParams("first", "dean", "second", "update","third",userId);
        //set the expectet data
        /*
        "birthDay='" + birthDay + '\'' +
                ", birthPlace='" + birthPlace + '\'' +
                ", gender='" + gender + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", ssn='" + ssn + '\'' +
                ", surname='" + surname + '\'' +
                ", username='" + username + '\'' +
         */
        String ssn = faker.numerify("###-##-####");
        String phoneNumber = faker.numerify("###-###-####");
        String username = faker.name().username();
        saveDean = new DeanRequestPojo( 239, "2000-12-12", "istanbul", "MALE",
                "Senih", "123asd?;", phoneNumber, ssn, "gunay", username);
        expectedData = new DeanRespponsePojo(saveDean, "Dean updated Successful", "OK");
        System.out.println("saveDean = " + saveDean);
        System.out.println("expectedData = " + expectedData);

        //send the request and get the response
        response = given(spec).when().body(saveDean).put("{first}/{second}/{third}");
        response.prettyPrint();
        //Do Assertion


    }

    @Then("Admin Put  Satatus kodun ikiyuz oldugunu dogrular")
    public void admin_put_satatus_kodun_ikiyuz_oldugunu_dogrular() {
        assertEquals(200, response.getStatusCode());

    }

    @Then("Admin Dean güncellendigini dogrular")
    public void admin_dean_güncellendigini_dogrular() {
        DeanRespponsePojo actualData = response.as(DeanRespponsePojo.class);
        assertEquals(saveDean.getName(), actualData.getObject().getName());
        assertEquals(saveDean.getSurname(), actualData.getObject().getSurname());
        assertEquals(saveDean.getBirthDay(), actualData.getObject().getBirthDay());
        assertEquals(saveDean.getGender(), actualData.getObject().getGender());
        assertEquals(saveDean.getBirthPlace(), actualData.getObject().getBirthPlace());
        assertEquals(saveDean.getSsn(), actualData.getObject().getSsn());
        assertEquals(saveDean.getPhoneNumber(), actualData.getObject().getPhoneNumber());
        assertEquals(saveDean.getUsername(), actualData.getObject().getUsername());
        assertEquals(expectedData.getMessage(), actualData.getMessage());
        assertEquals(expectedData.getHttpStatus(), actualData.getHttpStatus());

    }

}
