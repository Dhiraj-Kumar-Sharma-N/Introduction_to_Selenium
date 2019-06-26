package BrowserLaunch_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//-----------------------FIREFOX BROWSER ---------------------------------------------------

	System.setProperty("webdriver.gecko.driver","C://UDEMY_Selenium//Web Drivers//geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		
		
		System.out.println(" Firefox Browser launched Successfully ");
		
		//driver.manage().window().maximize();
				
		driver.get("https://www.amazon.in/");
		
		System.out.println("Browser navigated to AMAZON Successfully ");
		
		System.out.println(driver.getTitle());
		
		System.out.println("Browser Title retrieved Successfully ");
		
		driver.quit();
		
		System.out.println(" Firefox Browser Closed Successfully ");
		
		
	}
	

}
