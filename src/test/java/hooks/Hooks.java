package hooks;

import io.cucumber.java.Before;
import static base_urls.ManagementOnSchoolBaseUrl.setUp;

public class Hooks {

    @Before("@US05")
    public void before(){
        setUp();
    }


}
