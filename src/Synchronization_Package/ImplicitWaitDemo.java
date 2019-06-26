package Synchronization_Package;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ImplicitWaitDemo {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\UDEMY_Selenium\\Web Drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
	   System.out.println("Chrome Browser launched Successfully ");
	   
	   
	   //---------------------------->>>> IMPLICIT WAIT <<<<---------------------------------------
		
	   driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
	   
	   driver.get("https://www.goibibo.com/hotels/");
	   
	   //https://www.expedia.com/
	   
	   driver.findElement(By.id("gosuggest_inputL")).sendKeys("Dallas, Texas, US");
	   
	   Thread.sleep(2000);
	  
	   driver.findElement(By.id("gosuggest_inputL")).sendKeys(Keys.ARROW_DOWN);
	   
	   Thread.sleep(2000);
	   
	   driver.findElement(By.id("gosuggest_inputL")).sendKeys(Keys.ENTER);
	   

	   driver.findElement(By.xpath("(//a[contains(@href,'days-inn-market-center')])")).click();
		
	   driver.quit();
	   
	   System.out.println("Chrome Browser closed Successfully ");
		
		
		
		
		
	
	
	}
}
