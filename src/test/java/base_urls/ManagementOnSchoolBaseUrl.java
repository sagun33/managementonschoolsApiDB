package base_urls;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static utilities.ManagementOnSchoolAuthentication.generateToken;

public class ManagementOnSchoolBaseUrl {

    public static RequestSpecification spec;

    public static void setUp(){
        spec = new RequestSpecBuilder().setContentType(ContentType.JSON).
                addHeader("Authorization",generateToken()).
                setBaseUri("http://164.92.252.42:8080/").
                build();
    }
}
