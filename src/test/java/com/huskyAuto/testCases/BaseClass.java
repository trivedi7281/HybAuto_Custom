package com.huskyAuto.testCases;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.huskyAuto.utilities.ConfigReader;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class BaseClass {

	public ConfigReader configreader = new ConfigReader();
	public String baseURL = configreader.getURL();
	public String username = configreader.getUserName();
	public String password = configreader.getPassword();
	public String title = configreader.getTitle();
	public static WebDriver driver;
	public static Logger logger;

	@Parameters("browser")
	@BeforeClass
	public void setup(String br) {

		logger = Logger.getLogger("ebanking");
		PropertyConfigurator.configure("Log4j.properties");

		if (br.equals("chrome")) {

			// System.setProperty("webdriver.chrome.driver",configreader.getChromePath(););
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();

		} else if (br.equals("firefox")) {

			// System.setProperty("webdriver.gecko.driver",configreader.getFireFoxPath(););
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();

		} else if (br.equals("ie")) {

			// System.setProperty("webdriver.ie.driver",configreader.getIEPath(););
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();

		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseURL);
		logger.info("URL is opened");

	}

	@AfterClass
	public void tearDown() {

		driver.quit();
	}

	//method to introduce the capture screen
	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");//path where screenshots saved
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}
	

	// To create a Random Email id we make some Random Strings
	public String randomString() {

		String generateString = RandomStringUtils.randomAlphabetic(8);
		return (generateString);
	}
	
	public String randomNum() {

		String generateNumber = RandomStringUtils.randomNumeric(4);
		return (generateNumber);
	}



}
