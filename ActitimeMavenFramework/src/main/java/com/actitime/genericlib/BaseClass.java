package com.actitime.genericlib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.actitime.objectrepo.HomePage;
import com.actitime.objectrepo.LoginPage;

abstract public class BaseClass {
	public WebDriver driver;
	public ExcelUtils data = new ExcelUtils();
	public WebdriverCommonUtils wcu = new WebdriverCommonUtils();
	
	@BeforeClass
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/BrowserServer/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@BeforeMethod
	public void login() throws Exception {
		driver.get(data.getDataFromExcel("CommonData", 1, 0));
		LoginPage lp = new LoginPage(driver);
		lp.loginToApp(data.getDataFromExcel("CommonData", 1, 1), data.getDataFromExcel("CommonData", 1, 2));
	}
	@AfterMethod
	public void logout() {
		HomePage hp = new HomePage(driver);
		hp.logoutFromApp();
	}
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
}
