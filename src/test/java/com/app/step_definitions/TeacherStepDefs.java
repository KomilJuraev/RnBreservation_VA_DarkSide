package com.app.step_definitions;

import static org.junit.Assert.*;
import java.util.Calendar;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import com.app.pages.HomePage;
import com.app.pages.HuntPage;
import com.app.pages.LoginPage;
import com.app.pages.RoomPage;
import com.app.pages.SelfPage;
import com.app.utilities.BrowserUtils;
import com.app.utilities.ConfigurationReader;
import com.app.utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TeacherStepDefs {

	HuntPage huntPage = new HuntPage();
	LoginPage loginPage = new LoginPage();
	HomePage homePage = new HomePage();
	SelfPage selfPage = new SelfPage();
	RoomPage roomPage = new RoomPage();

	@Given("the teacher is on the home page")
	public void the_teacher_is_on_the_home_page() {
		Driver.getDriver().get(ConfigurationReader.getProperty("url"));
		loginPage.email.sendKeys("teachervasctoforstall@gmail.com");
		loginPage.password.sendKeys("scottforstall");
		loginPage.signInButton.click();
		BrowserUtils.waitForPageToLoad(10);

	}

	@When("the teacher clicks on the hunt link")
	public void the_teacher_clicks_on_the_hunt_link() {

		huntPage.huntLink.click();
	}

	@Then("hunt for a spot page should be displayed")
	public void hunt_for_a_spot_page_should_be_displayed() {
		String actualTitle = huntPage.header.getText();
		String expectedTitle = "hunt for spot";
		assertEquals("titles do not match", actualTitle, expectedTitle);
		huntPage.signOut();

	}

	@Given("the teacher logs in with {string} and {string}")
	public void the_teacher_logs_in_with_and(String username, String password) {
		Driver.getDriver().get(ConfigurationReader.getProperty("url"));
		loginPage.email.sendKeys(username);
		loginPage.password.sendKeys(password);
		loginPage.signInButton.click();
		BrowserUtils.waitForPageToLoad(10);

	}

	@When("the teacher clicks on the my dropdown menu")
	public void the_teacher_clicks_on_the_my_dropdown_menu() {
		BrowserUtils.hover(homePage.my);
		BrowserUtils.waitFor(2);

	}

	@When("selects self link")
	public void selects_self_link() {
		homePage.self.click();
		BrowserUtils.waitFor(7);
	}

	@Then("role teacher, team Teachers and name {string} should be displayed")
	public void role_teacher_team_Teachers_and_name_should_be_displayed(String fullName) {

		String actualName = selfPage.teacherSelfName.getText();
		assertEquals(fullName, actualName);

		String actualRole = selfPage.teacherSelfRole.getText();
		String expectedRole = "teacher";
		assertEquals(expectedRole, actualRole);

		String actualTeam = selfPage.teacherSelfTeam.getText();
		String expectedTeam = "Teachers";
		assertEquals(expectedTeam, actualTeam);
		selfPage.signOut();

	}

	@When("the teacher clicks on the {string} link on the map")
	public void the_teacher_clicks_on_the_link_on_the_map(String roomName) {
		String xpath = "//a[.='" + roomName + "']";
		WebElement roomLink = Driver.getDriver().findElement(By.xpath(xpath));
		roomLink.click();
		BrowserUtils.waitFor(7);

	}

	@Then("correct {string} and {string} should be displayed")
	public void correct_and_should_be_displayed(String roomName, String capacity) {

		String actualTitle = roomPage.roomTitle.getText();
		assertEquals(roomName, actualTitle);
		if (capacity.equals("6")) {
			assertTrue(roomPage.roomCapacity6.isDisplayed());

		} else if (capacity.equals("4")) {
			assertTrue(roomPage.roomCapacity4.isDisplayed());

		}

		selfPage.signOut();
	}

	@When("teacher picks date two days after current date and from {string} to {string}")
	public void teacher_picks_date_two_days_after_current_date_and_from_to(String fromTime, String toTime) {

		Calendar c = Calendar.getInstance();
		c.add(Calendar.DAY_OF_MONTH, 2);
		int dayOfMonth = c.get(Calendar.DAY_OF_MONTH);
		String dayOfMonthStr = String.valueOf(dayOfMonth);
		//System.out.println(dayOfMonthStr);
		int month = c.get(Calendar.MONTH);
		String monthStr = String.valueOf(month + 1);
		//System.out.println(monthStr);

		huntPage.dataSelectionBox.click();
		huntPage.dataSelectionBox.sendKeys(monthStr);

		BrowserUtils.waitFor(1);
		huntPage.dataSelectionBox.sendKeys(dayOfMonthStr);
		BrowserUtils.waitFor(1);

		Select selectFrom = new Select(huntPage.fromSelectionBox);
		BrowserUtils.waitFor(1);
		selectFrom.selectByVisibleText(fromTime);
		BrowserUtils.waitFor(1);
		Select selectTo = new Select(huntPage.toSelectionBox);
		BrowserUtils.waitFor(1);
		selectTo.selectByVisibleText(toTime);
		BrowserUtils.waitFor(1);

	}

	@Then("Search button is clickable")
	public void search_button_is_clickable() {

		assertTrue(huntPage.searchButton.isEnabled());

	}

}
