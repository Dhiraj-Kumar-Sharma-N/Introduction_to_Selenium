package SampleProjects;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Assignment_01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\UDEMY_Selenium\\Web Drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		System.out.println("Chrome Browser launched Successfully ");
		
		driver.get("http://qaclickacademy.com/practice.php");
		
		driver.findElement(By.xpath("//input[@value='radio3']")).click();
		
		driver.findElement(By.id("autocomplete")).sendKeys("IND");
		
	
		WebDriverWait wait = new WebDriverWait(driver,30);
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[@id='ui-id-1']//li")));
		
		
		
		
		
List<WebElement> allOptions = driver.findElements(By.xpath("//ul[@class='ui-menu ui-widget ui-widget-content ui-autocomplete ui-front']/li"));

System.out.println("Auto Suggest List ::" + allOptions.size());
		

		for (int i = 0; i < allOptions.size(); i++) {
			
			String option = allOptions.get(i).getText();
			
			System.out.println(option);
			
if (allOptions.get(i).getText().equalsIgnoreCase("Indonesia")) {
				
				allOptions.get(i).click();
				
				System.out.println("Indonesia Selected Successfully ");
				
				
			}
		}
		}
	
}
	


