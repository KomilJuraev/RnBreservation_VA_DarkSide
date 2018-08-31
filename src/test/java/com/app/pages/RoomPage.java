package com.app.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.utilities.Driver;

public class RoomPage {

	public RoomPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(xpath = "//h1")
	public WebElement roomTitle;

	@FindBy(xpath = "//p[@class='title is-6']")
	public WebElement roomCapacity;

	@FindBy(xpath = "//img[@src='assets/images/six.svg']")
	public WebElement roomCapacity6;

	@FindBy(xpath = "//img[@src='assets/images/four.svg']")
	public WebElement roomCapacity4;

}


