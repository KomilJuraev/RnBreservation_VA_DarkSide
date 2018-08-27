package com.app.step_definitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import com.app.pages.HomePage;
import com.app.pages.HuntPage;
import com.app.pages.LoginPage;
import com.app.pages.SelfPage;
import com.app.pages.TeamPage;
import com.app.utilities.BrowserUtils;
import com.app.utilities.ConfigurationReader;
import com.app.utilities.Driver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StudentStepDefs {

	LoginPage loginPage;
	HuntPage huntPage;
	SelfPage selfPage;
	HomePage homePage;
	TeamPage teamPage;

	@Given("the student is on the home page")
	public void the_student_is_on_the_home_page() {
		Driver.getDriver().get(ConfigurationReader.getProperty("url"));
		loginPage = new LoginPage();
		loginPage.email.sendKeys("efewtrell8c@craigslist.org");
		loginPage.password.sendKeys("jamesmay" + Keys.ENTER);
	}

	@When("the student enters valid date")
	public void the_student_enters_valid_date() {
		huntPage = new HuntPage();
		huntPage.huntLink.click();
		huntPage.dataSelectionBox.sendKeys("26");
		Select select = new Select(huntPage.fromSelectionBox);
		select.selectByVisibleText("7:30am");
		select = new Select(huntPage.toSelectionBox);
		BrowserUtils.waitFor(2);
		Select select2 = new Select(huntPage.fromSelectionBox);
		BrowserUtils.waitFor(2);
		select2.selectByVisibleText("8:30am");
		BrowserUtils.waitFor(2);
		huntPage.searchButton.click();
		BrowserUtils.waitFor(2);
	}

	@Then("the schedule is displayed")
	public void the_schedule_is_displayed() {
		throw new PendingException();
	}

	@When("the student clicks on the room name")
	public void the_student_clicks_on_the_room_name() {
		homePage = new HomePage();
		homePage.kilimanjaro.click();

	}

	@When("the student clicks on the my self name")
	public void the_student_clicks_on_the_my_self_name() {
		selfPage = new SelfPage();
		selfPage.goToSelf();

	}

	@Then("the role < student-team-member> is displayed")
	public void the_role_student_team_member_is_displayed() {
		String expRole = "student-team-member";
		String stRole = selfPage.studentSelfrole.getText();
		assertEquals(expRole, stRole);
	}

	@When("the student clicks on the my team name")
	public void the_student_clicks_on_the_my_team_name() {
		selfPage.goToTeam();
		BrowserUtils.waitFor(2);
	}

	@Then("the team members are displayed")
	public void the_team_members_are_displayed() {
		teamPage = new TeamPage();
		teamPage.goToTeam();
	}
}
