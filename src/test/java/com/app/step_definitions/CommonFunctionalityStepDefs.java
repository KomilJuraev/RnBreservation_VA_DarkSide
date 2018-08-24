package com.app.step_definitions;

import org.junit.Ignore;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import com.app.pages.HuntPage;
import com.app.pages.LoginPage;
import com.app.utilities.BrowserUtils;
import com.app.utilities.ConfigurationReader;
import com.app.utilities.Driver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;


public class CommonFunctionalityStepDefs {
	
	LoginPage loginPage;
	HuntPage huntPage;
	
	@Ignore
	@Given("the teacher is on home page")
	public void the_teacher_is_on_home_page() {
		Driver.getDriver().get(ConfigurationReader.getProperty("url"));
		loginPage = new LoginPage();
		loginPage.email.sendKeys("teachervamikemarcus@gmail.com");
		loginPage.password.sendKeys("mikemarcus" + Keys.ENTER);
		loginPage.signInButton.click();
		
		

		
	}
	@Ignore
@When("the teacher goes to hunt")
public void the_teacher_goes_to_hunt() throws InterruptedException {
huntPage = new HuntPage();
huntPage.huntLink.click();
wait(4);
//huntPage.dataSelectionBox.sendKeys("26");
//wait(4);
}
	@Ignore
@Then("the teacher should be able to reserve room from {int} minutes to {int} hours")
public void the_teacher_should_be_able_to_reserve_room_from_minutes_to_hours(String start, String finish) throws InterruptedException {
start ="7:000am";
finish = "8:00am";
//huntPage = new HuntPage();
//huntPage.huntLink.click();
//huntPage.dataSelectionBox.sendKeys("26");
Select select = new Select(huntPage.fromSelectionBox);
select.selectByVisibleText("7:30am");

//select = new Select(huntPage.toSelectionBox);
//wait(4);
//Select select2 = new Select(huntPage.fromSelectionBox);
//wait(4);
//select2.selectByVisibleText("8:00am");
//wait(4);
//huntPage.searchButton.click();
//wait(23);
}


//	@Given("the tech-lead is on home page")
//	public void the_tech_lead_is_on_home_page() {
//	   
//	}
//
//	@When("the tech-lead goes to hunt")
//	public void the_tech_lead_goes_to_hunt() {
//	   
//	}
//
//	@Then("the tech-lead should be able to reserve room from {int} minutes to {int} hours")
//	public void the_tech_lead_should_be_able_to_reserve_room_from_minutes_to_hours(Integer int1, Integer int2) {
//	  
//	}
//
	@Ignore
@Then("reservation options should be given in a format:from $ time to $time")
public void reservation_options_should_be_given_in_a_format_from_$_time_to_$time() {
	huntPage = new HuntPage();
	huntPage.huntLink.click();

	huntPage.dataSelectionBox.sendKeys("26");
	String actualFrom = huntPage.fromSelectionBox.getText();
	String expectedFrom = "7:00am";
	Assert.assertEquals(expectedFrom, actualFrom);
	String actualTo = huntPage.toSelectionBox.getText();
	String expectedTo = "9:00am";
	Assert.assertEquals(expectedTo, actualTo);
}
//
//	@Given("the teacher is on hunt page")
//	public void the_teacher_is_on_hunt_page() {
//	   
//	}
//
//	@When("the teacher enters valid date")
//	public void the_teacher_enters_valid_date() {
//	   
//	}
//
//	@Then("reservation window for the day should be from {int}am to {int} pm")
//	public void reservation_window_for_the_day_should_be_from_am_to_pm(Integer int1, Integer int2) {
//	   
//	}
//
//	@Given("the tech-lead is on hunt page")
//	public void the_tech_lead_is_on_hunt_page() {
//	   
//Then hunt for a spot page should be displayed 

//	}
//
//	@When("the tech-lead enters valid date")
//	public void the_tech_lead_enters_valid_date() {
//	    
//	}
//
//	@Given("the teacher is on the hunt page")
//	public void the_teacher_is_on_the_hunt_page() {
//	    
//	}
//
//	@When("the teacher goes to date")
//	public void the_teacher_goes_to_date() {
//	    
//	}
//
//	@Then("the calendar should be displayed")
//	public void the_calendar_should_be_displayed() {
//	
//	}
//
//	@Given("the tech-lead is on the hunt page")
//	public void the_tech_lead_is_on_the_hunt_page() {
//	    
//	}
//
//	@When("the tech-lead goes to date")
//	public void the_tech_lead_goes_to_date() {
//	   
	}
	
//
//
//

