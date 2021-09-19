package com.actitime.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(id = "logoutLink")
	private WebElement logoutLink;
	
	@FindBy(id = "container_users")
	private WebElement usersLink;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void logoutFromApp() {
		logoutLink.click();
	}
	
	public void navigateToUsers() {
		usersLink.click();
	}
}
