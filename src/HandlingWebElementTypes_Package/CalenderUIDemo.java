package HandlingWebElementTypes_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class CalenderUIDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
//-----------------------CHROME BROWSER ---------------------------------------------------

	System.setProperty("webdriver.chrome.driver","C:\\UDEMY_Selenium\\Web Drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		System.out.println("Chrome Browser launched Successfully ");
		
		driver.manage().window().maximize();
				
		driver.get("https://www.spicejet.com/");
		
		System.out.println("Browser opened Successfully ");
		
		System.out.println(driver.getTitle());
		
		System.out.println("Browser Title retrieved Successfully ");
		
		
		//---------------------->    HANDLING CALENDER UI   <--------------------------------
	
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		
		System.out.println("Dynamic DropDown Handled Successfully ");
		
		
		//Handling Current DATE 
		
		driver.findElement(By.cssSelector((".ui-state-default.ui-state-highlight.ui-state-hover"))).click();
		
		Thread.sleep(2000);
		
		//TO Check if the calender is enabled or is displayed 
		
		//System.out.println(driver.findElement(By.id("ctl00$mainContent$view_date2")).isEnabled());
		
		
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		
		// driver.findElement(By.name("ctl00$mainContent$rbtnl_Trip")).click();
		
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			
			System.out.println("The CALENDER IS DISPLAYED/ENABLED AND THE ROUND TRIP BUTTON IS AUTOMATICALLY CLICKED");
			
			Assert.assertTrue(true);
		}
		else {
			
			System.out.println("The CALENDER IS NOT DISPLAYED/ENABLED AND THE ROUND TRIP BUTTON IS NOT AUTOMATICALLY CLICKED");
			
			Assert.assertTrue(false);
		}
		
		driver.quit();
		
		System.out.println("CHROME Browser Closed Successfully ");
	}
	

}
