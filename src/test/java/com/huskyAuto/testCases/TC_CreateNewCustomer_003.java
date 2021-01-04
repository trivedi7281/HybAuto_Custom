package com.huskyAuto.testCases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.huskyAuto.pageObjects.LoginPage;
import com.huskyAuto.pageObjects.NewCustomer;

public class TC_CreateNewCustomer_003 extends BaseClass {

	@Test
	public void addNewCustomer() throws InterruptedException, IOException {

		LoginPage cred = new LoginPage(driver);
		cred.setUserName(username);
		logger.info("UserName is entered");
		cred.setPassword(password);
		logger.info("Password is entered");
		cred.clickSubmit();
		logger.info("Click on Submit");

		Thread.sleep(5000);

		NewCustomer addCustomer = new NewCustomer(driver);

		addCustomer.clickAddCustomerLink();

		Thread.sleep(5000);
		
		logger.info("Providing Customer Details");
		
		addCustomer.enterCustomerName("Akash Trivedi");
		addCustomer.selectCustomerGender("male");
		addCustomer.enterCustomerDOB("17", "08", "1991");
		Thread.sleep(5000);
		addCustomer.enterCustomerAddress("C01 Panchshlok Residency");
		addCustomer.enterCustomerCity("Ahmedabad");
		addCustomer.enterCustomerState("Gujarat");
		addCustomer.enterCustomerPincode("382424");
		addCustomer.enterCustomerMobileNumber("1234567890");

		String email = randomString() + randomNum() + "@gmail.com";
		addCustomer.enterCustomerEmailID(email);

		addCustomer.enterCustomerPassword("Abcd@1234");
		Thread.sleep(5000);
		addCustomer.clickSubmit();

		Thread.sleep(5000);

		logger.info("Validation started");
		
		boolean res = driver.getPageSource().contains("Customer Registered Successfully!!!");

		if (res == true) {

			captureScreen(driver, "addNewCustomer");
			Assert.assertTrue(true);
			logger.info("testcases Passed");
		} else {
			captureScreen(driver, "addNewCustomer");
			Assert.assertTrue(false);
			logger.info("testcases Failed");
		}
	}

}