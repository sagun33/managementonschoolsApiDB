package base_urls;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

import static utils.ManagementOnSchoolAuthentication.generateToken;

public class ManagementOnSchoolBaseUrl {

    public static RequestSpecification spec;

    public static void setUp(){
        spec = new RequestSpecBuilder().
                addHeader("Authorization",generateToken()).
                setBaseUri("http://209.38.244.227/").
                build();
    }
}
