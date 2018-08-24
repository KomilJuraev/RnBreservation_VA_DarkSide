package com.app.pages;

import org.openqa.selenium.WebElement;
<<<<<<< HEAD
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

=======
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
>>>>>>> 11f9c50358b8653bee6e669ceaf7e6e6a01f7cec
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


	// Student
	@FindBy(xpath = "(//p[@_ngcontent-c7])[1]")
	public WebElement studentSelfName;

	@FindBy(xpath = "(//p[@_ngcontent-c7])[3]")
	public WebElement studentSelfrole;

	@FindBy(xpath = "(//p[@_ngcontent-c7])[5]")
	public WebElement studentSelfTeam;

	@FindBy(xpath = "(//p[@_ngcontent-c7])[7]")
	public WebElement studentSelfBatch;

	@FindBy(xpath = "(//p[@_ngcontent-c7])[9]")
	public WebElement studentSelfCampus;

	@FindBy(xpath = "(//p[@_ngcontent-c7])[11]")
	public WebElement studentSelfSide;

	// Teacher
	@FindBy(xpath = "(//p[@_ngcontent-c6])[1]")
	public WebElement teacherSelfName;

	@FindBy(xpath = "(//p[@_ngcontent-c6])[3]")
	public WebElement teacherSelfRole;

	@FindBy(xpath = "(//p[@_ngcontent-c6])[5]")
	public WebElement teacherSelfTeam;

	@FindBy(xpath = "(//p[@_ngcontent-c6])[7]")
	public WebElement teacherSelfCampus;

	@FindBy(xpath = "(//p[@_ngcontent-c6])[9]")
	public WebElement teacherSelfSide;

	// Team Lead
	@FindBy(xpath = "(//p[@_ngcontent-c6])[1]")
	public WebElement teamLeadSelfName;

	@FindBy(xpath = "(//p[@_ngcontent-c6])[3]")
	public WebElement teamLeadSelfRole;

	@FindBy(xpath = "(//p[@_ngcontent-c6])[5]")
	public WebElement teamLeadSelfTeam;

	@FindBy(xpath = "(//p[@_ngcontent-c6])[7]")
	public WebElement teamLeadSelfBatch;

	@FindBy(xpath = "(//p[@_ngcontent-c6])[9]")
	public WebElement teamLeadSelfCampus;

	@FindBy(xpath = "(//p[@_ngcontent-c6])[11]")
	public WebElement teamLeadSelfSide;

}
