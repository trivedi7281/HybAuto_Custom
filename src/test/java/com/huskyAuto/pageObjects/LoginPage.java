package com.huskyAuto.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;

	// As we make here a constructor of a loginPage
	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}

	/* Here we can justify elements of the Login Page */

	// UserName
	@FindBy(name = "uid")
	@CacheLookup
	WebElement txtUserName;

	// Password
	@FindBy(name = "password")
	@CacheLookup
	WebElement txtPassword;

	// Submit Button
	@FindBy(name = "btnLogin")
	@CacheLookup
	WebElement btnLogin;
	
	@FindBy(xpath = "/html/body/div[3]/div/ul/li[15]/a")
	@CacheLookup
	WebElement logOutBtn;
	/* Here we can justify Action methods of the Login Page */

	public void setUserName(String uname) {
		txtUserName.sendKeys(uname);

	}

	public void setPassword(String pass) {
		txtPassword.sendKeys(pass);

	}

	public void clickSubmit() {
		btnLogin.click();

	}
	
	public void clicklogOutBtn() {
		logOutBtn.click();

	}

}
