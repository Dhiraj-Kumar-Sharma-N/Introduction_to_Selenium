package HandlingWebElementTypes_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TableGridDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
//-----------------------CHROME BROWSER ---------------------------------------------------

	System.setProperty("webdriver.chrome.driver","C:\\UDEMY_Selenium\\Web Drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		System.out.println("Chrome Browser launched Successfully ");
		
		driver.manage().window().maximize();
				
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/20787/nz-vs-ind-5th-odi-india-tour-of-new-zealand-2019");
		
		System.out.println("Browser opened Successfully ");
		
		System.out.println(driver.getTitle());
		
		System.out.println("Browser Title retrieved Successfully ");
		
		
		//---------------------->    HANDLING TABLE GRID    <--------------------------------
		
		int sum = 0;
		
		WebElement Table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		
		int rowcount = Table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();

		System.out.println("The Total number of rows = "+ rowcount);
		
		int scorecolumncount = Table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		
		for (int j = 0; j < scorecolumncount-2; j++) {
			
			String ValueInString = Table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(j).getText();
			
			System.out.println(ValueInString);
			
			int ValueInInteger = Integer.parseInt(ValueInString);
			
			sum = sum+ValueInInteger;	
			
		}
		
		System.out.println(sum);
		
		String extrastring = driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		
		System.out.println("EXTRAS : " + extrastring) ;
		
		int extrainteger = Integer.parseInt(extrastring);
		
		sum = sum+extrainteger;
		
		System.out.println("At the End of 1st innings : INDIA = "+ sum);
		
		String ActualTotal = driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		
		System.out.println(ActualTotal);
		
		int ActualTotalinteger = Integer.parseInt(ActualTotal);
		
				
		if (ActualTotalinteger==sum) {
			
			System.out.println("Total matches with the expected value and the test PASSED ");
			
		}
		
		else {
			
			System.out.println("Total  does not match with the expected value and the test FAILED ");
			
		}
		
		driver.quit();
		
		System.out.println("CHROME Browser Closed Successfully ");
	}
	

}
