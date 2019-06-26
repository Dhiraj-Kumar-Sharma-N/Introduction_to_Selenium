package SeleniumMethods_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ParentChildTraverseRelationship {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//-----------------------INTERNET EXPLORER BROWSER ---------------------------------------------------

		System.setProperty("webdriver.chrome.driver","C:\\UDEMY_Selenium\\Web Drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		
		System.out.println("IE Browser launched Successfully ");
		
		driver.manage().window().maximize();
				
		driver.get("https://www.google.in/");
		
		
	String s = driver.findElement(By.xpath("//*[@id=\"gbw\"]/div/div/div/div[2]/a")).getText();
		
		System.out.println(s);
		
		System.out.println("Browser navigated to AMAZON Successfully ");
		
		System.out.println(driver.getTitle());
		
		System.out.println("Browser Title retrieved Successfully ");
		
		driver.quit();
		
		System.out.println("IE Browser Closed Successfully ");
		
		
	}
	

}
