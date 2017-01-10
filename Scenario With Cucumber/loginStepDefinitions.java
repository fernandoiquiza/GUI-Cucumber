package org.fundacion.cucumber.login.login;


import org.fundacion.common.drivers.Driver;
import org.fundacion.pages.login.LoginPage;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


import java.io.IOException;

import static org.testng.Assert.assertEquals;

/**
 * Created by Fernando on 1/9/2017.
 */
public class loginStepDefinitions {
  WebDriver driver;
  LoginPage login;

  @Given("^I navigate to Pivotal Tracker Website$")
  public void openPivotalTracker() throws IOException {
    driver = Driver.getDriver().openBrowser();
    login = new LoginPage(driver);
  }

  @When("^I set a valid username/email as (.*?)$")
  public void validUsernameOrEmailIsSet(String userName) {
    login.setUserName(userName);
  }

  @And("^I press NEXT button a new password field should appear$")
  public void aNewPasswordFieldAppears() {
    login.clickContinue();
  }

  @And("^I set a valid password as (.*?)$")
  public void validPasswordIsSet(String password) {
    login.setPassword(password);
  }

  @And("^I press the SIGN IN button$")
  public void signInButtonIsPressed(){
    login.clickSubmit();
  }

  @Then("^I should be redirected to the Pivotal Dashboard and see the url as (.*?)$")
  public void redirectToPivotalTrackerDashboard(String url) {
    String actualResult = driver.getCurrentUrl();
    assertEquals(actualResult, url);
  }
}
