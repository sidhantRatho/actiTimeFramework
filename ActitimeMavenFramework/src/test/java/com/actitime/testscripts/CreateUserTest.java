package com.actitime.testscripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.actitime.genericlib.BaseClass;
import com.actitime.objectrepo.HomePage;
import com.actitime.objectrepo.UsersPage;

public class CreateUserTest extends BaseClass{

	@Test
	public void generateUserTest() throws Exception {
		HomePage hp = new HomePage(driver);
		UsersPage up = new UsersPage(driver);
		
		hp.navigateToUsers();
		up.navigateToCreateUser();
		
		String firstName = data.getDataFromExcel("UsersData", 1, 0);
		String lastName = data.getDataFromExcel("UsersData", 1, 1);
		String email = data.getDataFromExcel("UsersData", 1, 2);
		
		up.enterUserDetails(firstName, lastName, email);
		
		up.saveSendInvitation();
		
		up.clickOncloseLink();
		System.out.println("User Created Successfully...");
	}
}
