package com.southwest.airlines;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;

public class VerifyTitle {
 public static void main(String[] args) {
	
	 System.setProperty("webdriver.gecko.driver", "./driver/win/geckodriver.exe");
	 WebDriver driver = new FirefoxDriver();
	 driver.manage().deleteAllCookies();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
	 driver.get("https://www.southwest.com/");
	 
	 String expected_title = ("Southwest Airlines | Book Flights, Make Reservations & Plan a Trip");
	 String actual_title = driver.getTitle();
	 if(expected_title.equals(actual_title)) {
		 System.out.println("correct title");
	 }else {
		 System.out.println("incorrect title");
	 }
	 driver.quit();
			 
	 
}
}
