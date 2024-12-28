package stepDefinitions;

import io.cucumber.java.en.Then;
import pages.TrendyolHomePage;
import utils.ReusablaMethods;

public class SearchProductStepDefinitions {

    private TrendyolHomePage trendyolHomePage = new TrendyolHomePage();




    @Then("Sonuclarda {string} kelimesi görünür oldugu kontrol edilir")
    public void sonuclarda_kelimesi_görünür(String expectedText) {
        // Write code here that turns the phrase above into concrete actions
        ReusablaMethods.verifyElementIsVisible(trendyolHomePage.laptopText);

    }



}
