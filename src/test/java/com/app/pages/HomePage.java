package com.app.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.utilities.Driver;

public class HomePage {

	public HomePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(xpath = "//a[@class='navbar-item is-active']")
	public WebElement map;

	@FindBy(linkText = "schedule")
	public WebElement schedule;

	@FindBy(xpath = "//a[@routerlink='/hunt']")
	public WebElement hunt;

	@FindBy(linkText = "my")
	public WebElement my;

}
