package HandlingWebElementTypes_Package;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CheckBoxDemo {

	@SuppressWarnings("unlikely-arg-type")
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
		
		
		//---------------------->    HANDLING CHECKBOXES    <--------------------------------
		
		driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
		
		System.out.println("Senoir Citizen checkbox Clicked Successfully ");
		
		Boolean checkbox1selected =driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected();
		
		System.out.println("Is Senoir Citizen checkbox clicked ? "+checkbox1selected);
		
		driver.findElement(By.name("ctl00$mainContent$chk_Unmr")).click();
		
		String CheckBoxMessage = driver.findElement(By.name("ctl00$mainContent$chk_Unmr")).getText();
		
		Boolean checkbox2selected =driver.findElement(By.name("ctl00$mainContent$chk_Unmr")).isSelected();
		
		System.out.println("Is Unaccompanied Minor checkbox clicked ? "+checkbox2selected);
		
		System.out.println(CheckBoxMessage);
		
		
				
		//Handling multiple checkboxes which do not have any unique attribute
		
		int CheckBoxncount = driver.findElements(By.xpath("//input[@type='checkbox']")).size();
	
		System.out.println("The total number of check boxes is :" + CheckBoxncount);
		
		for(int i=1;i<CheckBoxncount;i++) {
			
			driver.findElements(By.xpath("//input[@type='checkbox']")).get(i).click();
			
			Thread.sleep(2000);
		}
		
	
		
		//To select one value based on text 
	
		List<WebElement> strlabel = driver.findElements(By.xpath("//div/label[contains(@for, 'ctl00_mainContent_chk')]"));
		
        ArrayList<String> arrlabel = new ArrayList<String>();
        
        for(WebElement elelabel : strlabel)
        {
               arrlabel.add(elelabel.getText());
        }
        
        for (int i =1; i<arrlabel.size(); i++)
        {
               System.out.println("The Value of "+i+ " checkbox is :" + arrlabel.get(i));
               
               if(arrlabel.equals(" Student")) {
				
				driver.findElements(By.xpath("//input[@type='checkbox']")).get(i).click();
				
				Thread.sleep(2000);
			}
        }

	
		driver.quit();
		
		System.out.println("CHROME Browser Closed Successfully ");
		
	}
	

}
