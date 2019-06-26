package HandlingWebElementTypes_Package;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotsDemo {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		
//-----------------------CHROME BROWSER ---------------------------------------------------

	System.setProperty("webdriver.chrome.driver","C:\\UDEMY_Selenium\\Web Drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		System.out.println("Chrome Browser launched Successfully ");
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		//driver.manage().deleteCookieNamed("Name of the Cookie ");
				
		driver.get("https://www.makemytrip.com/");
		
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);  //takes Screenshot 
		
		FileUtils.copyFile(src, new File ("C://UDEMY_Selenium/Screenshots/screenshot.png"));  //copy screenshot into a specified location
		
		System.out.println("Browser Navigated to MAKE MY TRIP Successfully ");
		
		System.out.println(driver.getTitle());
		
		System.out.println("Browser Title retrieved Successfully ");
		
		
		
		
	}
	

}
