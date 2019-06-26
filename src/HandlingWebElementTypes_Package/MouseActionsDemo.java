package HandlingWebElementTypes_Package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;


public class MouseActionsDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
//-----------------------CHROME BROWSER ---------------------------------------------------

	System.setProperty("webdriver.chrome.driver","C:\\UDEMY_Selenium\\Web Drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		System.out.println("Chrome Browser launched Successfully ");
		
		driver.manage().window().maximize();
				
		driver.get("https://www.amazon.in/");
		
		System.out.println("Browser opened Successfully ");
		
		System.out.println(driver.getTitle());
		
		System.out.println("Browser Title retrieved Successfully ");
		
		
		//---------------------->    MOUSE OVER     <--------------------------------
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Actions ActionClassObj = new Actions(driver);
		
		ActionClassObj.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Hello, Sign in')]"))).build().perform();
		
		driver.findElement(By.xpath("//span[contains(text(),'Your Wish List')]")).click();
		
		
		//---------------------->    TO HOLD ENTER AND THEN SEND A TEXT IN TEXT BOX TO OBTAIN CAPITAL LETTERS      <--------------------------------
		
		
		WebElement TextBox = driver.findElement(By.id("ap_email"));
		
		ActionClassObj.moveToElement(TextBox).click().keyDown(Keys.SHIFT).sendKeys("Dhirajkumar").build().perform();
		
		//ActionClassObj.moveToElement(TextBox).click().clickAndHold().moveByOffset(20, 40).sendKeys("Dhirajkumar").build().perform();
		
		//---------------------->    TO SELECT THE ENTIRE TEXT IN TEXT BOX     <--------------------------------
		
		
		ActionClassObj.moveToElement(TextBox).doubleClick().build().perform();
		
		//---------------------->    TO CLEAR ALL THE SELECTED TEXT IN TEXT BOX     <--------------------------------
		
		
		ActionClassObj.moveToElement(TextBox).doubleClick().sendKeys(Keys.BACK_SPACE).build().perform();
		
		//---------------------->    TO RIGHT CLICK ON SELECTED WEBELEMENT    <--------------------------------
		
		//createAccountSubmit
		
		ActionClassObj.moveToElement(driver.findElement(By.id("createAccountSubmit"))).contextClick().build().perform();
		
		System.out.println(driver.findElement(By.id("ap_email")).getText());
		
		driver.quit();
		
		System.out.println("Browser Closed Successfully ");
		
	}
	

}
