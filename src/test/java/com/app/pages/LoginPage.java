package com.app.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.utilities.Driver;

public class LoginPage {
	
	public LoginPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	
	@FindBy(name = "email")
	public WebElement email;
	
	@FindBy(name = "password")
	public WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement signInButton;
	
	@FindBy(linkText = "hunt")
	public WebElement huntLink;

}
