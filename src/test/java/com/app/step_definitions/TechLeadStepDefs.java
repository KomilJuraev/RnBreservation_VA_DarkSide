package com.app.step_definitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.app.pages.HomePage;
import com.app.pages.HuntPage;
import com.app.pages.LoginPage;
import com.app.pages.SchedulePage;
import com.app.pages.SelfPage;
import com.app.utilities.BrowserUtils;
import com.app.utilities.ConfigurationReader;
import com.app.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TechLeadStepDefs {

	LoginPage loginPage;
	HomePage homePage;
	SchedulePage schedulePage;
	HuntPage huntPage;
	Actions action;
	WebDriver driver;
	SelfPage selfPage;
	Alert alert;

	@Given("the user is on the home page")
	public void the_user_is_on_the_home_page() {
		Driver.getDriver().get(ConfigurationReader.getProperty("url"));
		BrowserUtils.waitFor(2);
	}

	@Given("user enters login {string} {string}")
	public void user_enters_login(String userName, String password) {
		loginPage = new LoginPage();
		loginPage.email.sendKeys(userName);
		loginPage.password.sendKeys(password);
		loginPage.signInButton.click();
		BrowserUtils.waitFor(3);

	}

	@When("user clicks the schedule button")
	public void user_clicks_the_schedule_button() {
		homePage = new HomePage();
		homePage.schedule.click();
		BrowserUtils.waitFor(3);

	}

	@Then("the header of the page is schedule")
	public void the_header_of_the_page_is_schedule() {
		schedulePage = new SchedulePage();
		assertTrue(schedulePage.title.isDisplayed());
		BrowserUtils.waitFor(2);
	}

	@Given("the user enters login {string} {string}")
	public void the_user_enters_login(String username, String password) {
		loginPage = new LoginPage();
		loginPage.email.sendKeys(username);
		loginPage.password.sendKeys(password);
		loginPage.signInButton.click();
		BrowserUtils.waitFor(3);

	}

	@When("the user clicks on hunt button from top right corner")
	public void the_user_clicks_on_hunt_button_from_top_right_corner() {
		BrowserUtils.waitFor(2);
		huntPage = new HuntPage();
		huntPage.huntLink.click();
		BrowserUtils.waitFor(2);
	}

	@Then("header of the page hunt for spot is displayed")
	public void header_of_the_page_hunt_for_spot_is_displayed() {
		huntPage = new HuntPage();
		String header = huntPage.header.getText();
		assertEquals(header, "hunt for spot");
	}

	@Then("select last day of the current week")
	public void select_last_day_of_the_current_week() {
		huntPage = new HuntPage();
		huntPage.dataSelectionBox.sendKeys("831");
		BrowserUtils.waitFor(2);
	}

	@Then("select {int}:{int} am for FROM selection box")
	public void select_am_for_FROM_selection_box(Integer int1, Integer int2) {
		huntPage = new HuntPage();
		Select select = new Select(huntPage.fromSelectionBox);
		select.selectByVisibleText("11:00am");
		BrowserUtils.waitFor(5);

	}

	@Then("select {int}:{int} am for TO selection box")
	public void select_pm_for_TO_selection_box(Integer int1, Integer int2) {
		huntPage = new HuntPage();
		Select select = new Select(huntPage.toSelectionBox);
		select.selectByVisibleText("12:00am");
		BrowserUtils.waitFor(2);
	}

	@Then("click search icon")
	public void click_search_icon() {
		huntPage = new HuntPage();
		huntPage.searchButton.click();
		BrowserUtils.waitFor(2);
	}

	@Then("header of the page free spots is displayed")
	public void header_of_the_page_free_spots_is_displayed() {
		huntPage = new HuntPage();
		String header = huntPage.freeSpotsHeader.getText();
		assertEquals(header, "free spots");
		BrowserUtils.waitFor(2);
	}

	@When("user logs in using {string} and {string}")
	public void user_logs_in_using_and(String login, String password) {
		loginPage = new LoginPage();
		loginPage.email.sendKeys(login);
		loginPage.password.sendKeys(password);
		loginPage.signInButton.click();
		BrowserUtils.waitFor(2);
	}

	@Then("select self from top right corner")
	public void select_self_from_top_right_corner() {
		selfPage = new SelfPage();
		selfPage.goToSelf();
		BrowserUtils.waitFor(2);

	}

	@Then("header of the page me is displayed")
	public void header_of_the_page_me_is_displayed() {
		selfPage = new SelfPage();
		assertTrue(selfPage.me.isDisplayed());
		BrowserUtils.waitFor(2);
	}

	@Then("correct team lead {string} is displayed")
	public void correct_team_lead_is_displayed(String fullName) {
		selfPage = new SelfPage();
		String name = selfPage.fullName.getText();
		assertEquals(name, fullName);
	}

	@Then("click book for denali")
	public void click_book_for_denali() {
		huntPage = new HuntPage();
		huntPage.daneliBook.click();
	}

	@Then("click on cofirm")
	public void click_on_cofirm() {
		BrowserUtils.waitFor(2);
		huntPage = new HuntPage();
		huntPage.confirmButton.click();
	}

	@Then("conference in denail has has been successfully scheduled message is displayed")
	public void conference_in_denail_has_has_been_successfully_scheduled_message_is_displayed() {
		schedulePage = new SchedulePage();
		assertTrue(schedulePage.title.isDisplayed());
	}

}
