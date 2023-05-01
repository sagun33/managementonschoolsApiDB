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

public class US05_Get_Dean_ById {
    Response response;
    DeanRequestPojo saveDean;
    DeanRespponsePojo expectedData;
    Faker faker = new Faker();
    int userId=0;
    @Given("Admin GetBy Id Request yapar")
    public void admin_get_by_id_request_yapar() {
        //set the url
        spec.pathParams("first", "dean", "second", "getManagerById","third",userId);
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
    @Then("Admin Get Status Code ikiyuz oldugunu dogrular")
    public void admin_get_status_code_ikiyuz_oldugunu_dogrular() {

    }
    @Then("Admin Dean hesabini görebildigini validate yapar")
    public void admin_dean_hesabini_görebildigini_validate_yapar() {

    }

}
