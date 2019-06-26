package BrowserLaunch_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEBrowserDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//-----------------------INTERNET EXPLORER BROWSER ---------------------------------------------------

	System.setProperty("webdriver.ie.driver","C:\\UDEMY_Selenium\\Web Drivers\\IEDriverServer.exe");
		
		WebDriver driver= new InternetExplorerDriver();
		
		
		System.out.println("IE Browser launched Successfully ");
		
		driver.manage().window().maximize();
				
		driver.get("https://www.amazon.in/");
		
		System.out.println("Browser navigated to AMAZON Successfully ");
		
		System.out.println(driver.getTitle());
		
		System.out.println("Browser Title retrieved Successfully ");
		
		driver.quit();
		
		System.out.println("IE Browser Closed Successfully ");
		
		
	}
	

}
