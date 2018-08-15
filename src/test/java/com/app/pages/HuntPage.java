package com.app.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.utilities.Driver;

public class HuntPage {

	public HuntPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(xpath = "//input[@name='date']")
	public WebElement dataSelectionBox;

	@FindBy(xpath = "//select[@id='timelineStart']")
	public WebElement fromSelectionBox;

	@FindBy(xpath = "//select[@id='timelineFinish']")
	public WebElement toSelectionBox;

	
}
