package Exercise_Packages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CountNumOfLinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
//-----------------------FIREFOX BROWSER ---------------------------------------------------

		System.setProperty("webdriver.chrome.driver","C:\\UDEMY_Selenium\\Web Drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		System.out.println("Chrome Browser launched Successfully ");
		
		driver.manage().window().maximize();
		
		driver.get("http://www.qaclickacademy.com/practice.php");
		
		System.out.println("Browser navigated Successfully ");
		
		System.out.println(driver.getTitle());
		
		System.out.println("Browser Title retrieved Successfully ");

		//-----------------------To retrieve total number of links in the Webpage  -----		
		
		int LinkCount = driver.findElements(By.tagName("a")).size();
		
		System.out.println("The total number of links on webpage = " + LinkCount);

		//-----------------------To retrieve total number of links in the footer section of Webpage  -----
		
		//LIMITING  WEBDRIVER SCOPE 
		
		WebElement FooterDriver =  driver.findElement(By.id("gf-BIG"));
		
		int FooterLinkCount = FooterDriver.findElements(By.tagName("a")).size();
		
		System.out.println("The total number of links in the footer section of Webpage = "+ FooterLinkCount);
		
	//-----------------------To retrieve total number of links in the 1ST Column section of Footer  ---------
		  
		
		WebElement ColumnDriver =  driver.findElement(By.xpath("//tr//td[1]//ul[1]"));
		
		int ColumnLinkCount = ColumnDriver.findElements(By.tagName("a")).size();
		
		System.out.println("The total number of links in the 1ST Column section of Footer = "+ ColumnLinkCount);
		
		/// alternative way 
		
		WebElement ColumnDriver1 = FooterDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		
		int ColumnLinkCount1 = ColumnDriver1.findElements(By.tagName("a")).size();
		
		System.out.println("The total number of links in the 1ST Column section of Footer from Parent Footer = "+ ColumnLinkCount1);
		

//  In that column click on each link and check the windows are open and ticked if the page is opening.
		
		String ControlClickBtn = Keys.chord(Keys.CONTROL,Keys.ENTER);
		
		for (int i = 1; i < ColumnLinkCount1; i++) {
			
			ColumnDriver1.findElements(By.tagName("a")).get(i).sendKeys(ControlClickBtn);
			
			Thread.sleep(2000);
			
		}
			Set<String> WindowId  = driver.getWindowHandles();
			
			Iterator<String> it =WindowId.iterator();
			
			while (it.hasNext()) 
			{
				String str = (String) it.next();
				
				driver.switchTo().window(str);
			
				System.out.println(driver.getTitle());
			
			
		}
		
		
		
		driver.quit();
		
		System.out.println("Chrome Browser Closed Successfully ");
		
	}
	

}
