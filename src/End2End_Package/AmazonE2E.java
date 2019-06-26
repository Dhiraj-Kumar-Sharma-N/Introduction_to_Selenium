package End2End_Package;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class AmazonE2E {

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
		
		ActionClassObj.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-shopall']//span[@class='nav-line-2']"))).build().perform();
		
		ActionClassObj.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Mobiles, Computers')]"))).build().perform();
		
		
		driver.findElement(By.xpath("//span[contains(text(),'Cases & Covers')]")).click();
		
		Boolean b= driver.findElement(By.xpath("//h1[contains(text(),'Mobile cases & covers')]")).isDisplayed();
		
		System.out.println(b);
		
		driver.quit();
		
		System.out.println("Browser Closed Successfully ");
		
	}
	

}
