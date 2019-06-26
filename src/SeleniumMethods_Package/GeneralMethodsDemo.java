package SeleniumMethods_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class GeneralMethodsDemo {

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
		
		driver.get("https://www.amazon.in/");
	
	// Print statement in the Output Console
		
		System.out.println("Browser navigated to AMAZON Successfully ");
		
	// Retrieve the Title of the Page and Print the title in the console
		
		System.out.println(driver.getTitle());
	
	// Print statement in the Output Console
		
		System.out.println("Browser Title retrieved Successfully ");
		
		
	// Retrieve the Current Url and store it in a string and validate with expected value
		
		String RetrievedURL = driver.getCurrentUrl();
		
		System.out.println(RetrievedURL);
		
	// To Retrieve the Page Source 
		
		System.out.println(driver.getPageSource());

	// To navigate to another URL and Click the Back Button to navigate between  previous Page and the next page
		
		driver.get("https://www.facebook.com/");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
	// Close the current browser Instance
		
		driver.close();
		
	// Close the all browser Instance created by Selenium Script
		
		driver.quit();
		
	// Print statement in the Output Console
		
		System.out.println("Chrome Browser Closed Successfully ");
		
		
	}
	

}
