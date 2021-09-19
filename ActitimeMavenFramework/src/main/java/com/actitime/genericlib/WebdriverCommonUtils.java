package com.actitime.genericlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebdriverCommonUtils {

	public void acceptAlert(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	
	public String getAlertMessage(WebDriver driver) {
		return driver.switchTo().alert().getText();
	}
	
	public void selectItemFromListByText(WebElement list , String itemText) {
		Select s = new Select(list);
		s.selectByVisibleText(itemText);
	}
}
