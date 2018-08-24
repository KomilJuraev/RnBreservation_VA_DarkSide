package com.app.pages;

<<<<<<< HEAD
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

=======
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
>>>>>>> 11f9c50358b8653bee6e669ceaf7e6e6a01f7cec
import com.app.utilities.Driver;

public class TeamPage {

	public TeamPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}


	@FindBy(xpath = "//p[.='name']/preceding-sibling::p[@class='title is-6']")
	public List<WebElement> teamMemberNames;

	@FindBy(xpath = "//p[.='role']/preceding-sibling::p[@class='title is-6']")
	public List<WebElement> teamMemberRoles;

	@FindBy(linkText = "my")
	public WebElement my;

	@FindBy(linkText = "self")
	public WebElement self;

	@FindBy(linkText = "team")
	public WebElement team;
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

	// Team Lead
	@FindBy(xpath = "(//p[@class='title is-6'])[1]")
	public WebElement teamLeadTeamMember1Name;

	@FindBy(xpath = "(//p[@class='title is-6'])[2]")
	public WebElement teamLeadTeamMember1Role;

	@FindBy(xpath = "(//p[@class='title is-6'])[3]")
	public WebElement teamLeadTeamMember2Name;

	@FindBy(xpath = "(//p[@class='title is-6'])[4]")
	public WebElement teamLeadTeamMember2Role;

	@FindBy(xpath = "(//p[@class='title is-6'])[5]")
	public WebElement teamLeadTeamMember3Name;

	@FindBy(xpath = "(//p[@class='title is-6'])[6]")
	public WebElement teamLeadTeamMember3Role;

	@FindBy(xpath = "(//p[@class='title is-6'])[7]")
	public WebElement teamLeadTeamMember4Name;

	@FindBy(xpath = "(//p[@class='title is-6'])[8]")
	public WebElement teamLeadTeamMember4Role;

	@FindBy(xpath = "(//p[@class='title is-6'])[9]")
	public WebElement teamLeadTeamMember5Name;

	@FindBy(xpath = "(//p[@class='title is-6'])[10]")
	public WebElement teamLeadTeamMember5Role;

	// Teacher
	@FindBy(xpath = "(//p[@class='title is-6'])[1]")
	public WebElement teacherTeamMemberName;

	@FindBy(xpath = "(//p[@class='title is-6'])[2]")
	public WebElement teacherTeamMemberRole;

	// Student
	@FindBy(xpath = "(//p[@class='title is-6'])[1]")
	public WebElement studentTeamMember1Name;

	@FindBy(xpath = "(//p[@class='title is-6'])[2]")
	public WebElement studentTeamMember1Role;

	@FindBy(xpath = "(//p[@class='title is-6'])[3]")
	public WebElement studentTeamMember2Name;

	@FindBy(xpath = "(//p[@class='title is-6'])[4]")
	public WebElement studentTeamMember2Role;

	@FindBy(xpath = "(//p[@class='title is-6'])[5]")
	public WebElement studentTeamMember3Name;

	@FindBy(xpath = "(//p[@class='title is-6'])[6]")
	public WebElement studentTeamMember3Role;

	@FindBy(xpath = "(//p[@class='title is-6'])[7]")
	public WebElement studentTeamMember4Name;

	@FindBy(xpath = "(//p[@class='title is-6'])[8]")
	public WebElement studentTeamMember4Role;

	@FindBy(xpath = "(//p[@class='title is-6'])[9]")
	public WebElement studentTeamMember5Name;

	@FindBy(xpath = "(//p[@class='title is-6'])[10]")
	public WebElement studentTeamMember5Role;
	
	
	

}
