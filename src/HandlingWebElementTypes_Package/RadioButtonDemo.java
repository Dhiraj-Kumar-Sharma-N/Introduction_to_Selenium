package HandlingWebElementTypes_Package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class RadioButtonDemo {

	public static void main(String[] args) {
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
		
		
		//---------------------->    HANDLING RADIO BUTTONS    <--------------------------------
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_2")).click();
		
		System.out.println("MultiCity Radio Button Clicked Successfully ");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String WarnMessage = driver.findElement(By.xpath("//div[@id='MultiCityModelPopup']/div/p[1]")).getText();
		
		System.out.println(WarnMessage);
		
		driver.findElement(By.id("MultiCityModelAlert")).click();
		
				
		//Handling multiple  radio buttons which do not have any unique attribute
		
		int RadioBtncount = driver.findElements(By.xpath("//input[@name='ctl00$mainContent$rbtnl_Trip']")).size();
	
		System.out.println("The total number of radio buttons is :" + RadioBtncount);
		
		for(int i=0;i<RadioBtncount;i++) {
			
			driver.findElements(By.xpath("//input[@name='ctl00$mainContent$rbtnl_Trip']")).get(i).click();
		}
		
		driver.findElement(By.id("MultiCityModelAlert")).click();
		
		//To select one value based on text 
		
		for(int i=0;i<RadioBtncount;i++) {
			
			String RabioBtnValue= driver.findElements(By.xpath("//input[@name='ctl00$mainContent$rbtnl_Trip']")).get(i).getAttribute("value");
			
			System.out.println(RabioBtnValue);
			
			if(RabioBtnValue.equals("RoundTrip")) {
				
				driver.findElements(By.xpath("//input[@name='ctl00$mainContent$rbtnl_Trip']")).get(i).click();	
			}
		}
		
	
		driver.quit();
		
		System.out.println(" CHROME Browser Closed Successfully ");
	}
	

}
