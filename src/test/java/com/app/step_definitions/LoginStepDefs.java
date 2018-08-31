package com.app.step_definitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.app.pages.HomePage;
import com.app.pages.LoginPage;
import com.app.utilities.ConfigurationReader;
import com.app.utilities.Driver;
import com.app.utilities.BrowserUtils;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefs {
	LoginPage loginPage = new LoginPage();
	HomePage homepage= new HomePage();


@Given("the user is on the login page")
public void the_user_is_on_the_login_page() {
    Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    BrowserUtils.waitForPageToLoad(2);
}

@When("the user tries to login  invalid user name {string} and password {string}")
public void the_user_tries_to_login_invalid_user_name_and_password(String email, String password) {
	loginPage.email.sendKeys("user2");
	loginPage.password.sendKeys("DavidBlane");
	loginPage.signInButton.click();
}

@Then("the system should display error message {string}")
public void the_system_should_display_error_message(String message) {
	BrowserUtils.waitFor(5);
	String actual = loginPage.errorMessage.getText();
	assertEquals(message, actual);
}

@When("the user tries to login user name {string} and password {string}")
public void the_user_tries_to_login_user_name_and_password(String string, String string2) {
	loginPage.email.sendKeys("efewtrell8c@craigslist.org");
	loginPage.password.sendKeys("DavidBlane");
	loginPage.signInButton.click();
}
   
@When("I login using  {string} and password {string}")
public void i_login_using_and_password(String mail, String password) {
	BrowserUtils.waitForVisibility(loginPage.email, 10);
	loginPage.email.sendKeys(mail);
	loginPage.password.sendKeys(password);
	loginPage.signInButton.click();
}

@Then("building {string} should be displayed")
public void users_should_be_displayed(String building) {
	BrowserUtils.waitFor(10);
	String actual = homepage.darkside.getText();
	assertEquals(building, actual);
	BrowserUtils.hover(homepage.my);
	homepage.signout.click();
}

}
