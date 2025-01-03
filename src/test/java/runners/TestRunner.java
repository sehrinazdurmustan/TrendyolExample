package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:/Users/Yoga/IdeaProjects/TrendyolExample/src/test/resources/features", // Feature dosyalarının yolu
        glue = {"stepDefinitions"},       // Step Definitions ve gerekli class'ların yolu
        plugin = {
                "pretty",                           // Konsol çıktısını daha okunabilir hale getirir
                "html:target/cucumber-reports.html", // HTML raporu oluşturur
                "json:target/cucumber-reports.json",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
                //"io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm"// Allure raporu için
        },
        monochrome = true,   // Konsol çıktısını daha okunabilir hale getirir
        dryRun = false
)
public class TestRunner {
}
