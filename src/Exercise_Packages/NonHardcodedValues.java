package Exercise_Packages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class NonHardcodedValues {

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

		//-----------------------To click on the radio button and retrieve the value   -----		
		
		WebElement  RadioBtn = driver.findElement(By.id("checkBoxOption2"));
		
		RadioBtn.click();
		
		Thread.sleep(2000);
		
		String RadioBtnValue = driver.findElement(By.xpath("//label[@for='benz']")).getText();
		
		System.out.println(RadioBtnValue);
		

		//-----------------------To use the value obtained and click on the corresponding dropdown value  -----
		
		driver.findElement(By.id("dropdown-class-example")).click();
		
		Select DropDownObj= new Select(driver.findElement(By.id("dropdown-class-example")));
		
		DropDownObj.selectByVisibleText(RadioBtnValue);
		
		
		// ---------------------to send the retrieved value to the alert text box and click on the button for an Alert -------------------------
		
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(RadioBtnValue);
		
		driver.findElement(By.id("alertbtn")).click();
		
		
		//-------------------- to Verify if the text obtained from the alert contains the retrieved value -----------
		
		
		String AlertMsg = driver.switchTo().alert().getText();
		
	if (AlertMsg.contains(RadioBtnValue)) {
		
		System.out.println("The text matches and Test is Passed ");
		
	}
	else {
		
		System.out.println("The text does not  matches and Test is Failed ");
	}
		
		driver.quit();
		
		System.out.println("Chrome Browser Closed Successfully ");
		
		
		
	}
	

}
