package com.huskyAuto.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class NewCustomer {

	WebDriver ldriver;

	// As we make here a constructor of a NewCustomer
	public NewCustomer(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'New Customer')]")
	@CacheLookup
	WebElement lnkAddCustomer;

	@FindBy(how = How.NAME, using = "name")
	@CacheLookup
	WebElement txtCustomerName;

	@FindBy(how = How.NAME, using = "rad1")
	@CacheLookup
	WebElement txtCustomerGender;

	@FindBy(how = How.ID_OR_NAME, using = "dob")
	@CacheLookup
	WebElement txtCustomerDOB;

	@FindBy(how = How.NAME, using = "addr")
	@CacheLookup
	WebElement txtCustomerAddress;

	@FindBy(how = How.NAME, using = "city")
	@CacheLookup
	WebElement txtCustomerCity;

	@FindBy(how = How.NAME, using = "state")
	@CacheLookup
	WebElement txtCustomerState;

	@FindBy(how = How.NAME, using = "pinno")
	@CacheLookup
	WebElement txtCustomerPincode;

	@FindBy(how = How.NAME, using = "telephoneno")
	@CacheLookup
	WebElement txtCustomerMobileNo;

	@FindBy(how = How.NAME, using = "emailid")
	@CacheLookup
	WebElement txtCustomerEmailID;

	@FindBy(how = How.NAME, using = "password")
	@CacheLookup
	WebElement txtCustomerPassword;

	@FindBy(how = How.NAME, using = "sub")
	@CacheLookup
	WebElement txtCustomerSubmit;

	@FindBy(how = How.NAME, using = "res")
	@CacheLookup
	WebElement txtCustomerReset;

	public void clickAddCustomerLink() {
		lnkAddCustomer.click();
	}

	public void enterCustomerName(String CustomerName) {
		txtCustomerName.sendKeys(CustomerName);
	}

	public void selectCustomerGender(String CustomerGender) {
		txtCustomerGender.click();
	}

	public void enterCustomerDOB(String mm, String dd, String yyyy) {
		txtCustomerDOB.sendKeys(mm);
		txtCustomerDOB.sendKeys(dd);
		txtCustomerDOB.sendKeys(yyyy);
	}

	public void enterCustomerAddress(String CustomerAddress) {
		txtCustomerAddress.sendKeys(CustomerAddress);
	}

	public void enterCustomerCity(String CustomerCity) {
		txtCustomerCity.sendKeys(CustomerCity);
	}

	public void enterCustomerState(String CustomerState) {
		txtCustomerState.sendKeys(CustomerState);
	}

	public void enterCustomerPincode(String CustomerPincode) {
		txtCustomerPincode.sendKeys(String.valueOf(CustomerPincode));
	}

	public void enterCustomerMobileNumber(String CustomerMobileNo) {
		txtCustomerMobileNo.sendKeys(CustomerMobileNo);
	}

	public void enterCustomerEmailID(String CustomerEmailID) {
		txtCustomerEmailID.sendKeys(CustomerEmailID);
	}

	public void enterCustomerPassword(String CustomerPassword) {
		txtCustomerPassword.sendKeys(CustomerPassword);
	}
	
	public void clickSubmit() {
		txtCustomerSubmit.click();
	}
	
	public void clickReset() {
		txtCustomerReset.click();;
	}

}
