package Exercise_Packages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReCapatchaDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub   https://patrickhlauke.github.io/recaptcha/
		
		
//-----------------------FIREFOX BROWSER ---------------------------------------------------

	System.setProperty("webdriver.gecko.driver","C://UDEMY_Selenium//Web Drivers//geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		
		
		System.out.println(" Firefox Browser launched Successfully ");
		
		driver.get("https://www.google.com/recaptcha/api2/demo");
		
		System.out.println("Browser navigated Successfully ");
		
		System.out.println(driver.getTitle());
		
		System.out.println("Browser Title retrieved Successfully ");
		
		int FrameNum = RetrieveFrameNumber(driver, By.className("recaptcha-checkbox-checkmark"));
		
		System.out.println(FrameNum);		
		
		driver.switchTo().frame(FrameNum);
		
		driver.findElement(By.className("recaptcha-checkbox-checkmark")).click();
		
		Thread.sleep(3000);
		
		System.out.println("I AM NOT A ROBOT checkbox Clicked successfully ");		
		
		driver.switchTo().defaultContent();
		
		int FrameNum2 = RetrieveFrameNumber(driver, By.cssSelector(".rc-button-default.goog-inline-block"));
		
		System.out.println(FrameNum2);
		
		driver.switchTo().frame(FrameNum2);
		
		driver.findElement(By.cssSelector(".rc-button-default.goog-inline-block")).click();
		
		System.out.println(driver.findElement(By.className("rc-imageselect-error-select-more")).getText());
		
		//driver.quit();
		
		System.out.println(" Firefox Browser Closed Successfully ");
		
		
	}
	
	
	
	
	
	public static int RetrieveFrameNumber(WebDriver driver,By Locator) throws InterruptedException {
		
		int i;
		
		int frameCount = driver.findElements(By.tagName("iframe")).size();
		
		for (i = 0; i < frameCount; i++) {
			
			Thread.sleep(3000);
			
			driver.switchTo().frame(i);
			
			int objcount = driver.findElements(Locator).size();
			
			if (objcount>0) {
				break;
			}
											
			}
		driver.switchTo().defaultContent();
		
		return i;
	
		}
		
	}

		
	
	
	

	

