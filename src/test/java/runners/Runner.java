package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        tags = "@US06",
        glue = {"stepdefinitions","hooks"},
        features = "./src/test/resources/features",
        dryRun = true//Seneryonun adımlarını kontrol eder ve çalıştığını görürüz


)

public class Runner {


}
