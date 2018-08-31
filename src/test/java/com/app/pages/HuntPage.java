package com.app.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.utilities.Driver;

public class HuntPage extends SelfPage{

	public HuntPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(xpath = "//h1")
	public WebElement header;

	@FindBy(xpath = "//a[@href='/hunt']")
	public WebElement huntLink;

	@FindBy(xpath = "//input[@name='date']")
	public WebElement dataSelectionBox;

	@FindBy(xpath = "//select[@id='timelineStart']")
	public WebElement fromSelectionBox;

	@FindBy(xpath = "//select[@id='timelineFinish']")
	public WebElement toSelectionBox;

	@FindBy(xpath = "//fa[@name='search']")
	public WebElement searchButton;
	
	@FindBy(xpath = "//h1")
	public WebElement freeSpotsHeader; 

	@FindBy(xpath = "//div[@class='columns is-multiline is-centered']/div[3]/div/footer/div[1]/form/button")
	public WebElement daneliBook;
	
	@FindBy(xpath = "//button[@class='button is-dark']")
	public WebElement confirmButton;

}
