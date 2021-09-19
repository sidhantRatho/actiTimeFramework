package com.actitime.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage {

	@FindBy(xpath = "//div[text()='New User']")
	private WebElement createUserBtn;
	
	@FindBy(id = "createUserPanel_firstNameField")
	private WebElement firstNameField;
	
	@FindBy(id = "createUserPanel_lastNameField")
	private WebElement lastNameField;
	
	@FindBy(id = "createUserPanel_emailField")
	private WebElement emailField;
	
	@FindBy(xpath = "//div[text()='Save & Send Invitation']")
	private WebElement saveSendInvitation;
	
	@FindBy(xpath = "//span[text()='Close']")
	private WebElement closeLink;
	
	
	public UsersPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void navigateToCreateUser() {
		createUserBtn.click();
	}
	
	public void enterUserDetails(String firstName , String lastName , String email) {
		firstNameField.sendKeys(firstName);
		lastNameField.sendKeys(lastName);
		emailField.sendKeys(email);
	}
	
	public void saveSendInvitation() {
		saveSendInvitation.click();
	}
	
	public void clickOncloseLink() {
		closeLink.click();
	}
}














