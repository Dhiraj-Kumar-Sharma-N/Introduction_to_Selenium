package HandlingWebElementTypes_Package;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class AssertionDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
//-----------------------CHROME BROWSER ---------------------------------------------------

	System.setProperty("webdriver.chrome.driver","C:\\UDEMY_Selenium\\Web Drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		System.out.println("Chrome Browser launched Successfully ");
		
		driver.manage().window().maximize();
				
		driver.get("https://www.spicejet.com/");
		
		System.out.println("Browser navigated to SPICEJET Successfully ");
		
		System.out.println(driver.getTitle());
		
		System.out.println("Browser Title retrieved Successfully ");
		
		
		//---------------------->    HANDLING STATIC DROPDOWN BUTTONS    <--------------------------------
		
		Select Obj1 = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		
		
		Obj1.selectByVisibleText("USD");
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		Obj1.selectByIndex(2);
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		Obj1.selectByValue("INR");
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		System.out.println("Drop Down Automated Successfully ");
				
				
		//--  > Updated code for New SATIC DROPDOWN
		
		driver.findElement(By.id("divpaxinfo")).click();
		
		
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
	
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult, 3 Child, 1 Infant");

		System.out.println("Assertion Passed ");
		
		Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).isSelected());
		
		driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).click();
		
		Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).isSelected());
		
		driver.close();
		
		System.out.println("CHROME Browser Closed Successfully ");
		
	}
	
	

}
