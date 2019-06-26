package Exercise_Packages;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
//-----------------------FIREFOX BROWSER ---------------------------------------------------

		System.setProperty("webdriver.chrome.driver","C:\\UDEMY_Selenium\\Web Drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		System.out.println("Chrome Browser launched Successfully ");
		
		driver.manage().window().maximize();
		
		driver.get("https://www.ksrtc.in/oprs-web/ticket/cancel.do");
		
		System.out.println("Browser navigated Successfully ");
		
		System.out.println(driver.getTitle());
		
		System.out.println("Browser Title retrieved Successfully ");
		
		driver.findElement(By.id("sbkg")).click();
				
		driver.findElement(By.id("fromPlaceName")).sendKeys("BEN");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		
		// driver.findElement(By.id("fromPlaceName")).getText();
		
		/*	
		 
		if a text box contains class="ui-helper-hidden-accessible" i.e. hidden text then gettext method cannont be used.
		
		Javascript DOM can extract hidden elements
		
		because selenium cannot identify hidden elements - (Ajax implementation)
		
		investigate the properties of object if it have any hidden text
		
		JAVASCRIPT EXECUTOR---TO RETRIEVE THE TEXT FROM A HIDDEN TEXTBOX Using Javascript executor API
		*/
		
		int i = 0;
		
		JavascriptExecutor jsexecuterobj = (JavascriptExecutor)driver;
		
		String ExtractedText = "return document.getElementById(\"fromPlaceName\").value;";
		
		String Text = (String) jsexecuterobj.executeScript(ExtractedText);
		
		System.out.println(Text);
		
		while (!Text.equalsIgnoreCase("BENGALURU INTERNATION AIPORT")) {
			
			i++;
			
			driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);	
			
			Text = (String) jsexecuterobj.executeScript(ExtractedText);
			
			System.out.println(Text);
			
			if(i>5) {
				
				break;
			}
			
		}
		
		System.out.println("Test Passed Successfully ");
		
		if(i>5) {
			
			System.out.println("Element not found with Expected Text (to end the loop we use this logic) ");
		}
		
		else {
			
			System.out.println("Element found with Expected Text ");
		}
		driver.quit();
		
		System.out.println("Chrome Browser Closed Successfully ");

		}
		
	
	
		
	}
	

