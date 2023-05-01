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

public class US05_Post_Dean {
    Response response;
    DeanRequestPojo saveDean;
    DeanRespponsePojo expectedData;
    Faker faker = new Faker();
    int userId=0;


    @Given("Admin Dean Post Request yapar")
    public void admin_dean_post_request_yapar() {
        //set the url
        spec.pathParams("first", "dean", "second", "save");
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
        int userId = 0;
        saveDean = new DeanRequestPojo(userId, "2000-12-12", "istanbul", "MALE",
                "Senih", "123asd?;", phoneNumber, ssn, "gunay", username);
        expectedData = new DeanRespponsePojo(saveDean, "Dean Saved", "CREATED");
        System.out.println("saveDean = " + saveDean);
        System.out.println("expectedData = " + expectedData);

        //send the request and get the response
        response = given(spec).when().body(saveDean).post("{first}/{second}");
        response.prettyPrint();
         //Do Assertion

    }

    @Then("Admin Post  Satatus kodun ikiyuz oldugunu dogrular")
    public void admin_post_satatus_kodun_ikiyuz_oldugunu_dogrular() {
        assertEquals(200, response.getStatusCode());

    }

    @Then("Admin Dean olustugunun validate yapar")
    public void admin_dean_olustugunun_validate_yapar() {

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
        userId=(int)(actualData.getObject().getUserId())  ;
        System.out.println("userId = " + userId);
        /*
        TeacherPojo actualTeacherPojo = response.as(TeacherPojo.class);

        assertEquals(objectPojo.getUsername(), actualTeacherPojo.getObject().getUsername());
        assertEquals(objectPojo.getName(), actualTeacherPojo.getObject().getName());
        assertEquals(objectPojo.getSurname(), actualTeacherPojo.getObject().getSurname());//Gerisi Ödev

        assertEquals(expectedData.getMessage(),actualTeacherPojo.getMessage());
        assertEquals(expectedData.getHttpStatus(),actualTeacherPojo.getHttpStatus());
         */

    }


    
}
