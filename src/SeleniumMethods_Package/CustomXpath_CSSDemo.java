package SeleniumMethods_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CustomXpath_CSSDemo {

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
		
		driver.get("https://www.salesforce.com/");
		
		driver.findElement(By.linkText("Login")).click();
		
	// Syntax to Generate CUSTOM XPATH FROM HTML 	
		
		//--------------->>   //TAGNAME[@ATTRIBUTE='VALUE']    <<---------------------------- 
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("ABC");
		
		
		//USING REGULAR EXPRESSION
			
	//--------------->>   //*[@ATTRIBUTE='VALUE']    <<---------------------------- 
		
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("123");
		
		
	//CLEAR all the values 
		
		driver.findElement(By.id("username")).clear();
		
		driver.findElement(By.id("password")).clear();
		
		
	// Syntax to Generate CUSTOM CSS SELECTOR FROM HTML 	
		
		//--------->>   TAGNAME[@ATTRIBUTE='VALUE'] or TAGNAME#IDVALUE  or TAGNAME.CLASSNAME  <<---------------------------- 
		
		driver.findElement(By.cssSelector("#username")).sendKeys("XYZ");
		
		//USING REGULAR EXPRESSION
	
		
	//--------------->>   //*[@ATTRIBUTE='VALUE']    <<---------------------------- 
		
		driver.findElement(By.cssSelector("[name='pw']")).sendKeys("789");
				
	
	//Click on Sign In anf get the error message to be validated .
		
		driver.findElement(By.cssSelector("#Login")).click();
		
		System.out.println(driver.findElement(By.xpath("//*[@id=\"error\"]")).getText());
	
		
 // For Element whose Locators keep changing use Regular Expression to write XPATH & CSS 	
				
		// Syntax to Generate CUSTOM XPATH FROM HTML 	
		
				//--------------->>   //TAGNAME[CONATIN(@ATTRIBUTE,'VALUE')]    <<---------------------------- 
				
				driver.findElement(By.xpath("//input[contains(@id,'user')]")).sendKeys("DHIRAJ");
				
				
				// Syntax to Generate CUSTOM CSS SELECTOR FROM HTML 	
				
				//--------->>   TAGNAME[@ATTRIBUTE*='VALUE'] or TAGNAME#IDVALUE  or TAGNAME.CLASSNAME  <<---------------------------- 
				
				driver.findElement(By.cssSelector("[type*='pas']")).sendKeys("123456789");
				
							
		
	// Close the all browser Instance created by Selenium Script
		
		driver.quit();
		
	// Print statement in the Output Console
		
		System.out.println("Chrome Browser Closed Successfully ");
		
		
	}
	

}

