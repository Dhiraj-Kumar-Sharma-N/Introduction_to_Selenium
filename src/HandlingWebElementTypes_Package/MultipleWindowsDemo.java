package HandlingWebElementTypes_Package;



import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MultipleWindowsDemo {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
//-----------------------CHROME BROWSER ---------------------------------------------------

	System.setProperty("webdriver.chrome.driver","C:\\UDEMY_Selenium\\Web Drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		System.out.println("Chrome Browser launched Successfully ");
		
		driver.manage().window().maximize();
				
		driver.get("https://www.myntra.com/");
		
		System.out.println("Browser navigated to SPICEJET Successfully ");
		
		System.out.println(driver.getTitle());
		
		System.out.println("Browser Title retrieved Successfully ");
		
		Actions ActionClassObj = new Actions(driver);
		
		WebElement TextBox = driver.findElement(By.xpath("//a[contains(text(),'Men')]"));
		
		ActionClassObj.moveToElement(TextBox).build().perform();
		
		WebElement CasualShoesLink = driver.findElement(By.xpath("//a[@href='/men-flip-flops']"));
		
		ActionClassObj.moveToElement(CasualShoesLink).keyDown(Keys.CONTROL).click().build().perform();
		
		System.out.println(driver.getTitle());

	
//-------------------> Retrieve the ids of each window and then iterate from parent window to child window --------------------------
		
		Set<String> ids= driver.getWindowHandles();
		
		Iterator<String> iter=ids.iterator();
		
		String ParentID = iter.next();
		
		String ChildID = iter.next();
		
		System.out.println(ParentID);
		
		System.out.println(ChildID);
		
//------------------->Switch to Child Window from Parent window which is default window --------------------------
		
		driver.switchTo().window(ChildID);
		
		driver.findElement(By.xpath("//label[contains(text(),'Puma')]")).click();
		
		System.out.println(driver.getTitle());
		

//------------------->Switch to Parent Window from Child window -------------------------------------------
		
		
		driver.switchTo().window(ParentID);
		
		driver.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-iconBag sprites-bag']")).click();
		
		System.out.println(driver.getTitle());

		
	}
	

}
