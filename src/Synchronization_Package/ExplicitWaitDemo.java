package Synchronization_Package;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ExplicitWaitDemo {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\UDEMY_Selenium\\Web Drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
	   System.out.println("Chrome Browser launched Successfully ");
		
	   
	   driver.get("https://www.goibibo.com/hotels/");
	   
	   driver.findElement(By.id("gosuggest_inputL")).sendKeys("Dallas, Texas, US");
	   
	   Thread.sleep(2000);
	  
	   driver.findElement(By.id("gosuggest_inputL")).sendKeys(Keys.ARROW_DOWN);
	   
	   Thread.sleep(2000);
	   
	   driver.findElement(By.id("gosuggest_inputL")).sendKeys(Keys.ENTER);
	   
	   System.out.println(driver.getTitle());
	   
	   //---------------------------->>>> EXPLICIT WAIT <<<<---------------------------------------
	   
	   WebDriverWait WaitObject =new WebDriverWait(driver, 10);
	   
	   
	   
	 WaitObject.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//a[contains(@href,'days-inn-market-center')])")));
	   
	   
	//  WaitObject.until(ExpectedConditions.titleIs("Results"));
	  

	   driver.findElement(By.xpath("(//a[contains(@href,'days-inn-market-center')])")).click();
		
	  	
	 
	   
	   System.out.println("Test Explicitly Waited for the hotel webement to be visible");
	   
		
		
		
		
		
	
	
	}
}
