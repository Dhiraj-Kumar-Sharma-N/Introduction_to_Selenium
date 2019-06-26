package HandlingWebElementTypes_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteCookiesMaximizeWinDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
//-----------------------CHROME BROWSER ---------------------------------------------------

	System.setProperty("webdriver.chrome.driver","C:\\UDEMY_Selenium\\Web Drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		System.out.println("Chrome Browser launched Successfully ");
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		//driver.manage().deleteCookieNamed("Name of the Cookie ");
				
		driver.get("https://www.makemytrip.com/");
		
		System.out.println("Browser Navigated to MAKE MY TRIP Successfully ");
		
		System.out.println(driver.getTitle());
		
		System.out.println("Browser Title retrieved Successfully ");
		
		//---------------------->    HANDLING AUTO SUGGESTIVE DROPDOWN BUTTONS    <--------------------------------
		
		
	}
	

}
