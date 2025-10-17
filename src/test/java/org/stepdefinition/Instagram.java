package org.stepdefinition;

import org.pom.HomePage;

import Base.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Instagram extends BaseClass{
	

@Given("Lanch The Browser")
public void lanchTheBrowser() {
    BrowserLanch();
    maxBrowser();
}

@When("Open The Instagram Login Page")
public void openTheInstagramLoginPage() {
    loadUrl("https://www.instagram.com/");
}

@When("Enter a Validate Email ID")
public void enterAValidateEmailID() {
   HomePage h = new HomePage();
    h.email("jyothisai123@gmail.com");
}

@When("Enter a Validate Password")
public void enterAValidatePassword() {
    HomePage h1 = new HomePage();
    h1.password("123654HH");
}

@When("Click On The Login Button")
public void clickOnTheLoginButton() {
   HomePage p = new HomePage();
   p.getLogin_BTN().click();
}

@Then("Close The Window")
public void closeTheWindow() {
    driver.quit();
}


}
