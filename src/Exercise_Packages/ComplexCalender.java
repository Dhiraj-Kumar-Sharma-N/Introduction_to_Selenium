package Exercise_Packages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ComplexCalender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
//-----------------------FIREFOX BROWSER ---------------------------------------------------

		System.setProperty("webdriver.chrome.driver","C:\\UDEMY_Selenium\\Web Drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		System.out.println("Chrome Browser launched Successfully ");
		
		driver.manage().window().maximize();
		
		driver.get("https://www.path2usa.com/travel-companions");
		
		System.out.println("Browser navigated Successfully ");
		
		System.out.println(driver.getTitle());
		
		System.out.println("Browser Title retrieved Successfully ");

		//-----------------------To select the Month  - APRIL  -----	
		
		driver.findElement(By.xpath("//input[@id='travel_date']")).click();
				
		//We get the text of each month and verify if it does not contains "April"(negation) and if it does not contain then we click on next button
	
        while (!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("April")) {
			
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}

	//-----------------------To select the date  03   -----	

        	//We get the common property/id for all the dates and retrieve the size of all the ements with that common property.

		int DateCount =driver.findElements(By.cssSelector(".day")).size();
		
		System.out.println(DateCount);
		
// -------------------------------We put all the elements into a list and iterate from 1st to all the elments using for loop
		
		//    List<WebElement> dates= driver.findElements(By.className("day"));
		
		//Grab common attribute//Put into list and iterate
		
		for (int i = 0; i < DateCount; i++) {
			
			String Date = driver.findElements(By.cssSelector(".day")).get(i).getText();

//------------------------------if the text of each retrieve list element we check if it is qual to "11" then we click that ith element from the list .			
			
			if (Date.equalsIgnoreCase("3")) {
				
				driver.findElements(By.cssSelector(".day")).get(i).click();
				
				break;
			}
			
			Thread.sleep(1000);
			
			}
		
		System.out.println(driver.findElement(By.xpath("//input[@value='Date of Travel']")).getAttribute("value"));
		
		System.out.println("COMPLEX CALENDER HANDLED SUCCESSFULLY ");
		
		driver.quit();
		
		System.out.println("Chrome Browser Closed Successfully ");
		
	}
	

}
