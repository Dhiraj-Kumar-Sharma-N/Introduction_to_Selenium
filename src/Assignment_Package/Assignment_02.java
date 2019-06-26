package Assignment_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment_02 {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\UDEMY_Selenium\\Web Drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
				
		System.out.println("Chrome Browser launched Successfully ");
		
		driver.get("https://www.cleartrip.com/");
		
		Thread.sleep(2000);
				
		driver.findElement(By.id("DepartDate")).click();
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active ")).click();
		
		Select AdultDropDown = new Select(driver.findElement(By.id("Adults")));
		
		AdultDropDown.selectByIndex(2);

		Select ChildrensDropDown = new Select(driver.findElement(By.id("Childrens")));
		
		ChildrensDropDown.selectByValue("4");
		
		
		Select InfantsDropDown = new Select(driver.findElement(By.id("Infants")));
		
		InfantsDropDown.selectByVisibleText("1");
		
		driver.findElement(By.xpath("//a[@id='MoreOptionsLink']")).click();
		
		Select ClassOfTravelDropDown = new Select(driver.findElement(By.cssSelector(".span.span20")));
		
		ClassOfTravelDropDown.selectByValue("Premium Economy");
		
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("INDIGO");
		
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys(Keys.ENTER);
		
		String ErrorMessage = "Sorry, but we can't continue until you fix everything that's marked in RED";
		
		Assert.assertEquals(ErrorMessage, driver.findElement(By.id("homeErrorMessage")).getText());
		
		System.out.println("Assertion Passed for E2E");
		
		driver.quit();
		
	}
}
