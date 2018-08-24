package com.app.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.utilities.Driver;

public class SelfPage {

	public SelfPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(xpath = "(//*[@class='title is-6'][1]")
	public WebElement name;

	@FindBy(xpath = "(//*[@class='title is-6'])[2]")
	public WebElement role;

	@FindBy(xpath = "(//*[@class='title is-6'])[3]")
	public WebElement team;

	@FindBy(xpath = "(//*[@class='title is-6'])[4]")
	public WebElement batch;

	@FindBy(xpath = "(//*[@class='title is-6'])[5]")
	public WebElement campus;

	@FindBy(linkText = "my")
	public WebElement my;

	@FindBy(linkText = "self")
	public WebElement self;

	@FindBy(linkText = "sign out")
	public WebElement signOut;

	public void goToTeam() {
		Actions actions = new Actions(Driver.getDriver());
		actions.moveToElement(my).perform();
		team.click();
	}

	public void signOut() {
		Actions actions = new Actions(Driver.getDriver());
		actions.moveToElement(my).perform();
		signOut.click();
	}

	public void goToSelf() {
		Actions actions = new Actions(Driver.getDriver());
		actions.moveToElement(my).perform();
		self.click();
	}

}
