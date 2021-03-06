package com.app.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.utilities.Driver;

public class LoginPage {
	
	public LoginPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	
	@FindBy(name = "email")
	public WebElement email;
	
	@FindBy(name = "email")
	public WebElement email2;
	
	@FindBy(name = "password")
	public WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement signInButton;
	
	@FindBy(xpath="//a[@href='/hunt']")
	public WebElement hunt;
	
	@FindBy(xpath = "//div[@class = 'cdk-live-announcer-element cdk-visually-hidden']")
	public WebElement errorMessage;
	
	
	
	

}
