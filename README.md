# HybAuto_Custom
This is a custom Framework and we can that of three (Mobile, Web, API) 


1st step: 

URL: http://demo.guru99.com/V3/index.php
User ID :	mngr300774
Password :	UjYtedU

title of the home page:  Guru99 Bank Manager HomePage 

STAGES/PHASES

1) Implementation
2) Execution
3) Maintainence


-----> Add some dependencies on POM.xml

<!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
		<dependency>
			<groupId>org.seleniumhq.selenium</groupId>
			<artifactId>selenium-java</artifactId>
			<version>3.141.59</version>
		</dependency>

<!-- https://mvnrepository.com/artifact/org.testng/testng -->
		<dependency>
			<groupId>org.testng</groupId>
			<artifactId>testng</artifactId>
			<version>7.1.0</version>
			<scope>test</scope>
		</dependency>

<!-- https://mvnrepository.com/artifact/org.apache.poi/poi -->
		<dependency>
			<groupId>org.apache.poi</groupId>
			<artifactId>poi</artifactId>
			<version>4.1.2</version>
		</dependency>

<!-- https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml -->
		<dependency>
			<groupId>org.apache.poi</groupId>
			<artifactId>poi-ooxml</artifactId>
			<version>4.1.2</version>
		</dependency>




----------> for Log of the Testcases some points to be remember

log4j

----------
log4j.jar
log4j.properties






------------------------------------------------------------------------------**********************************-------------------------------------------------------

--------------->
Read common values from the properties file


make config.properties file

then make util class readConfig.java



------------->

Add Extent Report

1) Maven Dependency


------------> How we run maven project by CMD line

1. Download download maven for windows 10(As per OS Requirement).
2. Set MAVEN HOME: C:\Program Files\Maven\bin 

project location:

C:\Users\INDIA\eclipse-workspace\HybAuto_Custom

type cd C:\Users\INDIA\eclipse-workspace\HybAuto_Custom to go to project location by cmd.


------------Run the Bat file 

Add the bat file in the project and edit with some piece of code that bat file.


-----url of remote repo

https://github.com/trivedi7281/HybAuto_Custom.git

git init

git remote add origin "https://github.com/trivedi7281/HybAuto_Custom.git"

git status

git add -A

git config --global user.name "Akash"

git config --global user.email "trivedi72881outlook.com" 

git commit -m "New Custom Hybrid Framework"

git push -u origin master


