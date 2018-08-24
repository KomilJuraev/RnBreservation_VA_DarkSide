package com.app.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.utilities.Driver;

public class MapPage {
	public MapPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(tagName = "h1")
	public WebElement campus;

}
