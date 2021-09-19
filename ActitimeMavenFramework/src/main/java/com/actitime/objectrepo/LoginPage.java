package com.actitime.objectrepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(id = "username")
	private WebElement usernameTxt;
	
	@FindBy(name = "pwd")
	private WebElement passwordTxt;
	
	@FindBy(id = "loginButton")
	private WebElement loginBtn;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void loginToApp(String username , String password) {
		usernameTxt.sendKeys(username);
		passwordTxt.sendKeys(password);
		loginBtn.click();
	}
}
