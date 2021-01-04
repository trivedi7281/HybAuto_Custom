package com.huskyAuto.testCases;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.huskyAuto.pageObjects.LoginPage;
import com.huskyAuto.utilities.XLUtils;

public class TC_LoginTestDDT_002 extends BaseClass {

	@Test(dataProvider = "LoginData")
	public void MultiUserLoginCheck(String username, String password) throws IOException, InterruptedException {

		LoginPage cred = new LoginPage(driver);
		cred.setUserName(username);
		logger.info("UserName is entered");
		cred.setPassword(password);
		logger.info("Password is entered");
		cred.clickSubmit();
		logger.info("Click on Submit");

		Thread.sleep(3000);

		if (isAlertPresent() == true) {

			driver.switchTo().alert().accept();// close the alert
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
			logger.warn("Login Failed");
		} else {
			Assert.assertTrue(true);
			logger.info("Click on LogoutBtn");
			cred.clicklogOutBtn();
			Thread.sleep(3000);
			driver.switchTo().alert().accept();// close logout Alert
			driver.switchTo().defaultContent();
		}
	}

	public boolean isAlertPresent() // user define method created to checke the alert present or not!!!
	{

		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {

			return false;

		}

	}

	@DataProvider(name = "LoginData")
	String[][] getData() throws IOException {

		String Path = (System.getProperty("user.dir") + "/src/test/java/com/huskyAuto/testData/DataFile.xlsx");

		int rownums = XLUtils.getRowCount(Path, "Sheet1");
		int colnums = XLUtils.getCellCount(Path, "Sheet1", 1);

		String loginData[][] = new String[rownums][colnums];

		for (int i = 1; i <= rownums; i++) {

			for (int j = 0; j < colnums; j++) {

				loginData[i - 1][j] = XLUtils.getCellData(Path, "Sheet1", i, j);// 1 0

			}
		}
		return loginData;

	}

}
