package com.huskyAuto.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

	Properties pro;

	public ConfigReader() {

		File src = new File("./Configuration/config.properties");

		try {
			FileInputStream fin = new FileInputStream(src);
			pro = new Properties();
			pro.load(fin);

		} catch (Exception e) {
			System.out.println("Exception is" + e.getMessage());
		}

	}

	public String getURL() {

		return pro.getProperty("baseURL");
	}

	public String getUserName() {

		return pro.getProperty("username");
	}

	public String getPassword() {

		return pro.getProperty("password");
	}

	public String getTitle() {

		return pro.getProperty("title");
	}

	public String getChromePath() {

		return pro.getProperty("chromepath");
	}

	public String getIEPath() {

		return pro.getProperty("iepath");
	}
	
	public String getFireFoxPath() {

		return pro.getProperty("firefoxpath");
	}

}
