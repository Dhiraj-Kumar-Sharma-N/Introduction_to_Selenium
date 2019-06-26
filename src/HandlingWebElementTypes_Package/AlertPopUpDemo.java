package HandlingWebElementTypes_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AlertPopUpDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
//-----------------------CHROME BROWSER ---------------------------------------------------

	System.setProperty("webdriver.chrome.driver","C:\\UDEMY_Selenium\\Web Drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		System.out.println("Chrome Browser launched Successfully ");
		
		driver.manage().window().maximize();
				
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		
		System.out.println("Browser opened Successfully ");
		
		System.out.println(driver.getTitle());
		
		System.out.println("Browser Title retrieved Successfully ");
		
		
		//---------------------->    HANDLING JAVA ALERT OR POPUP  BUTTONS    <--------------------------------
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();
		
		Thread.sleep(5000);
		
		System.out.println(driver.switchTo().alert().getText()); //TO RETRIVE THE ALERT MESSAGE
		
		driver.switchTo().alert().accept(); //YES/DONE/OK

		//driver.switchTo().alert().dismiss(); //NO/CANCEL
		
		//driver.switchTo().alert().sendKeys("value"); // TO SEND SOME VALUE IN CASE OF PASSWORD POPUP
		
		driver.quit();
		
		System.out.println("CHROME Browser Closed Successfully ");
	}
	

}
