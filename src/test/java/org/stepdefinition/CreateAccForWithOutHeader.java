package org.stepdefinition;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.pom.CreateAccoForFB;

import Base.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateAccForWithOutHeader extends BaseClass{
	
	@Given("Launch The Browser")
	public void launchTheBrowser() {
		BrowserLanch();
		maxBrowser();
	}

	@When("Open The FackBook Url")
	public void openTheFackBookUrl() {
		loadUrl("https://www.facebook.com/r.php?entry_point=login");
	}

	@When("Enter The First Name")
	public void enterTheFirstName(io.cucumber.datatable.DataTable dataTable) {
	CreateAccoForFB c = new CreateAccoForFB();
	WebElement firstName = c.getFirstName();
	List<String> asList = dataTable.asList();
	firstName.sendKeys(asList.get(2));
	}

	@When("Enter The Last Name")
	public void enterTheLastName(io.cucumber.datatable.DataTable dataTable) {
		CreateAccoForFB c = new CreateAccoForFB();
		List<List<String>> asLists = dataTable.asLists();
		c.lastName(asLists.get(1).get(2));
	}

	@Then("Close The Browser")
	public void closeTheBrowser() {
		driver.quit();
	}	

}
