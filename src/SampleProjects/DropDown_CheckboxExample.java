package SampleProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_CheckboxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
System.setProperty("webdriver.chrome.driver","C:\\UDEMY_Selenium\\Web Drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		System.out.println("Chrome Browser launched Successfully ");
		
		driver.manage().window().maximize();
				
		driver.get("http://qaclickacademy.com/practice.php");
		
		System.out.println("Browser navigated to SPICEJET Successfully ");
		
		System.out.println(driver.getTitle());
		
		System.out.println("Browser Title retrieved Successfully ");
		
		
		driver.findElement(By.id("dropdown-class-example")).click();
		
		Select DropDownObj= new Select(driver.findElement(By.id("dropdown-class-example")));
		
		DropDownObj.selectByIndex(2);	
		
		
	}
	

}
