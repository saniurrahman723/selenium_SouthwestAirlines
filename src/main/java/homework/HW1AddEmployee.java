package homework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HW1AddEmployee {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "./driver/win/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		driver.get("https://www.qa-asr-tek.org/visitor");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class=('btn btn-success asrteklogin')]")).click();
		driver.findElement(By.name("username")).sendKeys("test@asr-tek.com");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("pass1");

		driver.findElement(By.xpath("(//*[contains(text(),'Login')])")).click();
		Thread.sleep(2000);

		//		driver.findElement(By.xpath("//*[@class=('toggle')]")).click();
		//		Thread.sleep(1000);
		//		driver.findElement(By.xpath("(//*[@class='on-half-expanded'])[2]")).click();
		//		Thread.sleep(2000);
		//		driver.findElement(By.xpath("//*[@id=('addEmployee')]")).click();
		//		Thread.sleep(2000); 

		driver.get("https://www.qa-asr-tek.org/employee/addEmployee");
		driver.findElement(By.xpath("//*[@name='firstName']")).sendKeys("Mohammad");
		driver.findElement(By.xpath("//*[@name='lastName']")).sendKeys("Rahman");
		driver.findElement(By.xpath("//*[@name='email']")).sendKeys("rahman@yahoo.com");
		driver.findElement(By.xpath("//*[@name='phoneNumber']")).sendKeys("3474011234");
		Thread.sleep(2000);
		
		Select select = new Select(driver.findElement(By.xpath("//*[@name='JobId']")));
		driver.findElement(By.xpath("//*[@name='JobId']")).click();
		Thread.sleep(1000);
		select.selectByValue("FI_MGR");
		
		driver.findElement(By.xpath("//*[@name='salary']")).sendKeys("12000");
		driver.findElement(By.xpath("//*[@name='commission']")).sendKeys("10");
		driver.findElement(By.xpath("//*[@name='managerId']")).sendKeys("203");
		Thread.sleep(2000);
		
		Select selectDep = new Select(driver.findElement(By.xpath("//*[@name='department_name']")));
		driver.findElement(By.xpath("//*[@name='department_name']")).click();
		Thread.sleep(1000);
		selectDep.selectByValue("IT Support");
		
		Select selectState = new Select(driver.findElement(By.xpath("//*[@name='location']")));
		driver.findElement(By.xpath("//*[@name='location']")).click();
		selectState.selectByValue("Tennessee");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@name='managedBy']")).sendKeys("John");
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//*[@class='tfbutton btn btn-success']")).click();
		Thread.sleep(2000);
		
		driver.get("https://www.qa-asr-tek.org/viewemployee/all");
		driver.findElement(By.xpath("//*[@class=('tftextinput')]")).sendKeys("Mohammad");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@value=('Search')]")).click();
		String value = driver.findElement(By.xpath("//tbody/tr[2]/td[2]")).getText();
		System.out.println("FirstName: "+value);
		String value2 = driver.findElement(By.xpath("//tbody/tr[2]/td[12]")).getText();
		System.out.println("RecordedBy: "+value2);
		Thread.sleep(1000);
		driver.quit();
		
		
		

	}

}
