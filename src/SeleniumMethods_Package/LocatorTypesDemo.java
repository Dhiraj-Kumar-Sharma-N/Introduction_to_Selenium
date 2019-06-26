package SeleniumMethods_Package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LocatorTypesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//-----------------------CHROME BROWSER ---------------------------------------------------
		
	// Set the driver Path for Chrome Driver
		
		System.setProperty("webdriver.chrome.driver","C:\\UDEMY_Selenium\\Web Drivers\\chromedriver.exe");
		
	// Driver Object from WebDriver Interface for Chrome Driver/Initialize an object of Webdriver class interface
		
		WebDriver driver= new ChromeDriver();
		
	// Print statement in the Output Console	 
			
		System.out.println("Chrome Browser launched Successfully ");
	
	// Mazimize the Browser Window 
		
		driver.manage().window().maximize();
		
	// Navigate to a particular URL mentioned in the aurgument
		
		driver.get("https://www.facebook.com/");
		
	//Types of Locators/Identifiers in Selenium
		
		driver.findElement(By.id("email")).sendKeys("Dhiraj Kumar");

		driver.findElement(By.name("pass")).sendKeys("Password");
		
		driver.findElement(By.linkText("Forgotten account?")).click();
		
		driver.findElement(By.className("uiButtonText")).click();
	
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("USER NAME");
		
		driver.findElement(By.cssSelector("#pass")).sendKeys("123456789");
		
		driver.findElement(By.partialLinkText("Create")).click();
		
		List <WebElement> list = driver.findElements(By.tagName("a"));
		
		System.out.println("Number of links: "+list.size());
		
		for(int i = 0; i < list.size(); i++){
			
		System.out.println(list.get(i).getText());
		
		}
	// Close the all browser Instance created by Selenium Script
		
		driver.quit();
		
	// Print statement in the Output Console
		
		System.out.println("Chrome Browser Closed Successfully ");
		
		
	}
	

}

