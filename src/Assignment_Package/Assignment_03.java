package Assignment_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Assignment_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\UDEMY_Selenium\\Web Drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		System.out.println("Chrome Browser launched Successfully ");
		
		  driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		  
		  driver.findElement(By.xpath("//a[contains(text(),'Click to load get data via Ajax!')]")).click();
		  
		  WebDriverWait WaitObj = new WebDriverWait(driver, 10);
		  
		/* 
		  String S = "Process completed!  This response has been loaded via the Ajax request directly from the web server, without reoading this page.";
		  
		  
		  WaitObj.until(ExpectedConditions.textToBePresentInElementValue(driver.findElement(By.id("results")), S));
		  
		  
		  WaitObj.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("results")));
		  
		  */
		 
		  WaitObj.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("results"))));
		  
		
		  System.out.println(driver.findElement(By.id("results")).getText());

		
		driver.quit();
	}

}
