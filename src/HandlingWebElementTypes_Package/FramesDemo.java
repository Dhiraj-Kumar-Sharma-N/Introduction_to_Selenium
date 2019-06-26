package HandlingWebElementTypes_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class FramesDemo {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
//-----------------------CHROME BROWSER ---------------------------------------------------

	System.setProperty("webdriver.chrome.driver","C:\\UDEMY_Selenium\\Web Drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		System.out.println("Chrome Browser launched Successfully ");
		
		driver.manage().window().maximize();
				
		driver.get("http://jqueryui.com/droppable/");
		
		System.out.println("Browser navigated to SPICEJET Successfully ");
		
		System.out.println(driver.getTitle());
		
		System.out.println("Browser Title retrieved Successfully ");
		
		
//--------> Retrieve the number of frames present in the webpage ------------------------------	
		
		int noofframes = driver.findElements(By.tagName("iframe")).size();
		
		System.out.println("the total number of frames in the webpage = " + noofframes);
			
//--------> Retrieve the ids of each frame and then iterate from one frame to another//Appllicabe only if Ids are provided for the iframe ------------
	
		//driver.switchTo().frame(null);Instead of numm place the id of the frame .
		
//------------------->Switch to a frame using .frame(frame number) (starts with 0)  --------------------------
		
		driver.switchTo().frame(0);
		
		System.out.println(driver.findElement(By.id("draggable")).getText());
		
//------------------->Switch to default webpage from iframe ------------------------------------
		
		
		driver.switchTo().parentFrame();
		
		
		driver.switchTo().defaultContent();
		
		
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Google");

//------------------->Switch to a frame using .frame(WebElement element )   -------------------------------------------
		
		WebElement Frameelement=driver.findElement(By.className("demo-frame"));
		
		driver.switchTo().frame(Frameelement);
		
		System.out.println(driver.findElement(By.id("draggable")).getText());
		
		
//-------------------> Webement from iframe dragged and dropped   -------------------------------------------		
		
		WebElement Dragablelement =driver.findElement(By.id("draggable"));
		
		WebElement Dropablelement =driver.findElement(By.id("droppable"));
		
		Actions actionobj =new Actions(driver);
		
		actionobj.click().dragAndDrop(Dragablelement, Dropablelement).build().perform();
		
		System.out.println("Webement from iframe dragged and dropped successfully");
			
	}
	

}
