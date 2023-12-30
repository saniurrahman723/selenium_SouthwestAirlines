package com.southwest.airlines;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateNewAccount {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "./driver/win/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		driver.get("https://www.southwest.com/");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='actionable actionable_link actionable_light link header-control--control']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@name='customer.firstName']")).sendKeys("Abul");
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@name='customer.middleName']")).sendKeys("Kalam");
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@name='customer.lastName']")).sendKeys("Azad");
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@name='customer.suffix']")).click();

		Thread.sleep(500);
		Select dropdwon = new Select(driver.findElement(By.id("customer.suffix")));
		dropdwon.selectByValue("MD");
		Thread.sleep(500);


		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@name='customer.birthMonth']")).click();
		Select dropdown = new Select(driver.findElement(By.name("customer.birthMonth")));
		Thread.sleep(1000);

		dropdown.selectByValue("2");
		Thread.sleep(500);

		driver.findElement(By.xpath("//*[@name='customer.birthDay']")).click();
		Thread.sleep(500);

		Select dropdown1 = new Select(driver.findElement(By.name("customer.birthDay")));
		Thread.sleep(500);
		dropdown1.selectByValue("21");

		driver.findElement(By.xpath("//*[@name='customer.birthYear']")).click();
		Thread.sleep(500);

		Select dropdown2 = new Select(driver.findElement(By.name("customer.birthYear")));
		Thread.sleep(500);
		dropdown2.selectByValue("2004");
		driver.findElement(By.xpath("//*[@name='customer.gender']")).click();
		Thread.sleep(500);

		Select dropdown3 = new Select(driver.findElement(By.name("customer.gender")));
		Thread.sleep(500);

		dropdown3.selectByValue("Male");
		driver.findElement(By.xpath("//*[@name='customer.familiarName']")).sendKeys("Abul");	
		driver.findElement(By.xpath("//*[@name='contactInfo.addresses[0].country']")).click();

		Select dropdwon4 = new Select(driver.findElement(By.name("contactInfo.addresses[0].country")));
		Thread.sleep(500);
		dropdwon4.selectByValue("US");
		driver.findElement(By.xpath("//*[@name='contactInfo.addresses[0].line1']")).sendKeys("263 Stafford Circle");
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@name='contactInfo.addresses[0].line2']")).sendKeys("Apt 420");
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@name='contactInfo.addresses[0].city']")).sendKeys("Cordova");
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@name='contactInfo.addresses[0].state']")).click();
		Thread.sleep(500);

		Select dropdown5 = new Select(driver.findElement(By.name("contactInfo.addresses[0].state")));
		dropdown5.selectByValue("TN");
		driver.findElement(By.xpath("//*[@name='contactInfo.addresses[0].zipOrPostalCode']")).sendKeys("38018");
		Thread.sleep(500);

		driver.findElement(By.xpath("//*[@name='contactInfo.phones[0].phoneNumber.countryCode']")).click();
		Thread.sleep(500);
		Select dropdwon6 = new Select(driver.findElement(By.name("contactInfo.phones[0].phoneNumber.countryCode")));
		dropdwon6.selectByValue("1");

		driver.findElement(By.xpath("//*[@id='js-intl-number']")).sendKeys("3474012251");
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id='js-contact-email']")).sendKeys("abulkalam@yahoo.com");
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id='js-contact-email-confirmation']")).sendKeys("abulkalam@yahoo.com");
		Thread.sleep(500);

		driver.findElement(By.xpath("//*[@name='account.username']")).sendKeys("abul723");
		driver.findElement(By.xpath("(//*[@type='button'])[3]")).click();
		driver.findElement(By.xpath("//*[@name='account.password'] ")).sendKeys("pass123$");
		driver.findElement(By.xpath("(//*[@type='button'])[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[@type='button'])[4]")).click();
		Thread.sleep(2000);

		Select sq1 = new Select(driver.findElement(By.xpath("//*[@id='js-security-question-1']")));
		sq1.selectByValue("What is the name of your first pet?");
		driver.findElement(By.xpath("//*[@id='js-security-answer-1']")).sendKeys("tommy");
		Thread.sleep(1000);

		Select sq2 = new Select(driver.findElement(By.xpath("//*[@id='js-security-question-2']")));
		sq2.selectByValue("What is your favorite ice cream flavor?");
		driver.findElement(By.xpath("//*[@id='js-security-answer-2']")).sendKeys("mango");

		boolean checkbox = driver.findElement(By.id("customer.signUpForEmails1")).isSelected();
		if(checkbox == true) {
			System.out.println("checkBox is checked already");
		}else 
			System.out.println("checkbox is not checked already ");
		//driver.findElement(By.id("customer.signUpForEmails1")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id='js-submit-button']")).click();
		driver.quit();
	}
	




}


