package Synchronization_Package;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TwoTypesOfWaitDemo {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\UDEMY_Selenium\\Web Drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
	   System.out.println("Chrome Browser launched Successfully ");
	   
	   
	   //---------------------------->>>> IMPLICIT WAIT <<<<---------------------------------------
	   
	    driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
	   
	   
	   	
	   driver.get("https://www.expedia.com/");
	   
	   driver.findElement(By.cssSelector(".uitk-icon.uitk-icon-hotels")).click();
	   
	   driver.findElement(By.id("hotel-destination-hp-hotel")).sendKeys("Bengaluru, India");
	   
	   Thread.sleep(2000);
	   
	   driver.findElement(By.id("hotel-destination-hp-hotel")).sendKeys(Keys.ARROW_DOWN);
	   
	   Thread.sleep(2000);
	   
	   driver.findElement(By.id("hotel-destination-hp-hotel")).sendKeys(Keys.ENTER);
	   
	   driver.findElement(By.xpath("//button[@data-gcw-change-submit-text='Search']")).click();
	   
	 //---------------------------->>>> EXPLICIT WAIT <<<<---------------------------------------
	   
	   WebDriverWait Waidobj = new WebDriverWait(driver, 20);
	   
	   Waidobj.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@target='30291829']")));
	   
	   driver.findElement(By.xpath("//a[@target='30291829']")).click();
	   
	   System.out.println(driver.getTitle());
	   
	   
			}
}
