package SeleniumMethods_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TraversebtnParentSiblingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//-----------------------CHROME BROWSER ---------------------------------------------------

		System.setProperty("webdriver.chrome.driver","C:\\UDEMY_Selenium\\Web Drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		
		System.out.println("CHROME Browser launched Successfully ");
		
		driver.manage().window().maximize();
				
		driver.get("http://www.qaclickacademy.com/interview.php");
		
		driver.findElement(By.xpath("//section[@id='content']/div/div/div/div/ul/li[2]")).click();
		
		//------>   Traversing from parent node to child node  
		
		System.out.println(driver.findElement(By.xpath("//*[@id=\"tablist1-panel2\"]/ul/li/div/h3[2]/b")).getText());
		
		// Relative XPATH -   XPATH that does not depend on the Parent Node
		// Absolute XPATH -   XPATH that does  depend on the Parent Node
		
		//------>   Traversing from child node to parent node (If the parent node attribute values are dynamiic )
		
		String str1 = driver.findElement(By.xpath("//section[@id='content']/div/div/div/div/ul/li[2]/parent::ul")).getText();
		
		System.out.println("The list contains the following elements "+ str1 );
		
		
	//------>   Traversing from child node to its sibling node (If the sibling node attribute values are dynamiic )
		
		driver.findElement(By.xpath("//ul[@class='responsive-tabs__list']/li[1]/following-sibling::li[3]")).click();
		
		
		System.out.println("Questions include" + driver.findElement(By.xpath("//*[@id=\"tablist1-panel4\"]/ul/li/div/h3[1]")).getText());
		
		
	//Identifying objects with text using xpath locators
		
		driver.findElement(By.xpath("//*[text()=' Appium ']")).click();
		
		String str2 = driver.findElement(By.xpath("//*[@id=\"tablist1-panel1\"]/ul/li/div/h3[1]")).getText();
		
		System.out.println(" Questions include  "+ str2 );
		
		driver.quit();
		
		System.out.println("CHROME Browser Closed Successfully ");
		
		
		
	}
	

}
