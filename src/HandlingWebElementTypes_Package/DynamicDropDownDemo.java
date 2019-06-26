package HandlingWebElementTypes_Package;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class DynamicDropDownDemo {

	public static void main(String[] args) throws InterruptedException {
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
		
		//---------------------->    HANDLING DYNAMIC DROPDOWN BUTTONS    <--------------------------------
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		
		System.out.println("Dynamic DropDown Handled  Successfully ");
		
		
		//Alternative way in order to avoid using indexes (Using Parent Child Realtionship to uniquely identify object)
		
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		driver.findElement(By.xpath("//*[@id=\"glsctl00_mainContent_ddl_originStation1_CTNR\"] //a[@value='GOI']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"glsctl00_mainContent_ddl_destinationStation1_CTNR\"] //a[@value='DEL']")).click();
		
		System.out.println("Dynamic DropDown Handled  Successfully ");
		
		
	}
	

}
