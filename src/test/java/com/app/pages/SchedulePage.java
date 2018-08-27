package com.app.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.utilities.Driver;

import com.app.utilities.Driver;

public class SchedulePage {

	public SchedulePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(className = "title")
	public WebElement title; 
	
}
