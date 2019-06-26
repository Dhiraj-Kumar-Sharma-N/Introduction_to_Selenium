package Assignment_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assignment_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\UDEMY_Selenium\\Web Drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		System.out.println("Chrome Browser launched Successfully ");
		
		driver.get("http://qaclickacademy.com/practice.php");
		  
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Unit");
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		
		//String Str ="return document.getElementById(\"autocomplete\").value ;";
		
		String SelectedStr  = (String) js.executeScript("return document.getElementById(\"autocomplete\").value ;");
		
		//String text = (String) js.executeScript("return document.getElementById(\"autocomplete\").value");
		
		System.out.println(SelectedStr);
		
		int i=0;
		
		while (!SelectedStr.equalsIgnoreCase("United Kingdom")) {
			
			i++;
			
			driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(Keys.DOWN);
		
			SelectedStr  = (String) js.executeScript("return document.getElementById(\"autocomplete\").value ;");
			
			System.out.println(SelectedStr);
			
		if(i>5) {
			
			System.out.println("Element not found ");
			
			break;
			
		}else {
				
				System.out.println("Element found ");
			}
		}
		
		System.out.println("Test Passed Successfully");
		
		driver.quit();
		
		System.out.println("Chrome Browser Closed Successfully ");
		
		}
	
	}

