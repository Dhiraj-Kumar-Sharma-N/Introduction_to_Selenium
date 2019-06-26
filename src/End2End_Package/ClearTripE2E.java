package End2End_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ClearTripE2E {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\UDEMY_Selenium\\Web Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		System.out.println("Chrome Browser launched Successfully ");

		driver.get("https://www.cleartrip.com/");

		Thread.sleep(2000);

		driver.findElement(By.name("origin")).sendKeys("BLR");

		Thread.sleep(6000);

		driver.findElement(By.name("origin")).sendKeys(Keys.ENTER);

		Thread.sleep(2000);

		driver.findElement(By.name("destination")).sendKeys("MAA");

		Thread.sleep(6000);

		driver.findElement(By.name("destination")).sendKeys(Keys.ENTER);

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

		// driver.findElement(By.id("SearchBtn")).click();

		Thread.sleep(8000);

		System.out.println(driver.getCurrentUrl());
		
		Boolean b= driver.findElement(By.className("booking")).isDisplayed();
		
		System.out.println("END TO END FOR CLEARTRIP COMPLETED : "+b);

		driver.quit();

	}
}
