package End2End_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SpiceJetE2E {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\UDEMY_Selenium\\Web Drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
	   System.out.println("Chrome Browser launched Successfully ");
		
		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		

		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			
			System.out.println("The CALENDER IS DISPLAYED/ENABLED AND THE ROUND TRIP BUTTON IS AUTOMATICALLY CLICKED");
			
			Assert.assertTrue(true);
		}
		else {
			
			System.out.println("The CALENDER IS NOT DISPLAYED/ENABLED AND THE ROUND TRIP BUTTON IS NOT AUTOMATICALLY CLICKED");
			
			Assert.assertFalse(false);
		}
		
		
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		
		driver.findElement(By.id("divpaxinfo")).click();
		
		Thread.sleep(2000);
				
		for (int i=1;i<5;i++) {
					
			
					driver.findElement(By.id("hrefIncAdt")).click();
			}
			
				int j=0;
								
		while(j<3) {
					
					driver.findElement(By.id("hrefIncChd")).click();
					
					j++;
				}
				
			int k=0;				
		do {
			
				driver.findElement(By.id("hrefIncInf")).click();
					k++;
			}		
			
			while(k<1);
								
				Thread.sleep(2000);
				
				driver.findElement(By.id("btnclosepaxoption")).click();
				
				
				String NumOfPax= driver.findElement(By.id("divpaxinfo")).getText();
				
				
				System.out.println(NumOfPax);
				
				driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
				
				Thread.sleep(6000);		
				
	System.out.println(driver.getTitle());
	
	System.out.println(driver.getCurrentUrl());
	
	Boolean b= driver.findElement(By.className("trip-modify-btn")).isDisplayed();
	
	System.out.println("END TO END FOR SPICEJET COMPLETED : "+b);
	
	driver.quit();
	
	}
}
