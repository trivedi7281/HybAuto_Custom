package com.huskyAuto.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.huskyAuto.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {

	@Test
	public void loginTest() throws IOException {

		
		LoginPage cred = new LoginPage(driver);
		cred.setUserName(username);
		logger.info("UserName is entered");
		cred.setPassword(password);
		logger.info("Password is entered");
		cred.clickSubmit();
		logger.info("Click on Submit");

		if(driver.getTitle().equals(title)) {
			Assert.assertTrue(true);
			logger.info("Login Test Passed");
		} else {
			captureScreen(driver, "loginTest");
			Assert.assertTrue(false);
			logger.info("Login Test Failed");

		}

	}

}
