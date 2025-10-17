package org.stepdefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Base.BaseClass;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Hook extends BaseClass{

	@Before(order = 1,value = "@sanity")
	public void precondition1() {
		System.out.println("Pre Condition NO: 1");
	}
	
	@Before(order = 2)
	public void precondition2() {
		System.out.println("Pre Condition NO: 2");
		System.out.println("Browser Lanch");
		BrowserLanch();	
	}
	
	@Before(order = 3)
	public void precondition3() {
		System.out.println("Pre Condition NO: 3");
		System.out.println("Maximise The Browser");
		maxBrowser();
	}
	
	@After(order = 3)
	public void postcondition1() {
		System.out.println("Post Condition No: 3");
	}
	
	@After(order = 2)
	public void postcondition2(Scenario s) {
		
		if (s.isFailed()) {	
			TakesScreenshot ts = (TakesScreenshot)driver;
			byte[] screenshotAs = ts.getScreenshotAs(OutputType.BYTES);
			s.embed(screenshotAs,"png");
		}
		
		System.out.println("Post Condition No: 2");
	}
	
<<<<<<< HEAD
	private void jyothiSai() {
		System.out.println("Sample code for git fetch added by JyothiSai");

	}
=======
	private void sai() {
		System.out.println("Sample code for git fetch added by Sai");

	}
	
>>>>>>> d41c3bc7beb0a53b6a95793672cf04c1d6a5a173
	@After(order = 1)
	public void postcondition3() {
		System.out.println("Post Condition No: 1");
		System.out.println("Browser Close");
		driver.quit();
	}
}
