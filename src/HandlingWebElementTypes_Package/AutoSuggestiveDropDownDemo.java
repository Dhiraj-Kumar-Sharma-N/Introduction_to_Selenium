package HandlingWebElementTypes_Package;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class AutoSuggestiveDropDownDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
//-----------------------CHROME BROWSER ---------------------------------------------------

	System.setProperty("webdriver.chrome.driver","C:\\UDEMY_Selenium\\Web Drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		System.out.println("Chrome Browser launched Successfully ");
		
		driver.manage().window().maximize();
				
		driver.get("https://www.makemytrip.com/");
		
		System.out.println("Browser navigated to MAKE MY TRIP Successfully ");
		
		System.out.println(driver.getTitle());
		
		System.out.println("Browser Title retrieved Successfully ");
		
		//---------------------->    HANDLING AUTO SUGGESTIVE DROPDOWN BUTTONS    <--------------------------------
		
		WebElement Source=driver.findElement(By.id("hp-widget__sfrom"));
		
		Source.clear();
		
		Source.sendKeys("DEL");
		
		Source.sendKeys(Keys.ENTER);
		
		WebElement Destination  = driver.findElement(By.id("hp-widget__sTo"));
				
		Destination.sendKeys("abu");
		
		Thread.sleep(3000);
		
		Destination.sendKeys(Keys.ARROW_DOWN);
		
		Destination.sendKeys(Keys.ENTER);
		
		String org= driver.findElement(By.cssSelector("#hp-widget__sfrom")).getAttribute("value");
		
		System.out.println("The origin is " + org);
		
		String dest= driver.findElement(By.xpath("//*[@id=\"hp-widget__sTo\"]")).getAttribute("value");
		
		System.out.println("The destination is "+ dest);
		
		System.out.println("Auto Suggestive DropDown Handled  Successfully ");
	
		
	}
	

}
