package BrowserLaunch_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ChromeBrowserDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//-----------------------CHROME BROWSER ---------------------------------------------------

		//Driver Object from WebDriver Interface for Chrome Driver 
		
		System.setProperty("webdriver.chrome.driver","C:/UDEMY_Selenium/Web Drivers/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		System.out.println("Chrome Browser launched Successfully ");
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		System.out.println("Browser navigated to AMAZON Successfully ");
		
		System.out.println(driver.getTitle());
		
		System.out.println("Browser Title retrieved Successfully ");
		
		driver.quit();
		
		System.out.println("Chrome Browser Closed Successfully ");
		
		
	}
	

}
