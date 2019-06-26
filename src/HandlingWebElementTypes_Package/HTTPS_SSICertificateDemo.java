package HandlingWebElementTypes_Package;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;


public class HTTPS_SSICertificateDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		

//---------------------->    HANDLING SSI CERTIFICATES    <--------------------------------
		
		// Pop up which contains proceed anyways,back to safety buttons and sometimes we get advanced setting and then navigate to proceed .
			
			
			// DESIRED CAPABILITIES - (creating a general profile) 
			
			DesiredCapabilities capabilities =DesiredCapabilities.chrome();
			
			capabilities.acceptInsecureCerts();
			/*
			capabilities.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
			
			capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			*/
			//SSI CERTIFICATES (chromeOptions class - to set the local browser setting ) - 
			
			ChromeOptions chromeObj = new ChromeOptions();
			
			chromeObj.merge(capabilities);
			

	System.setProperty("webdriver.chrome.driver","C:\\UDEMY_Selenium\\Web Drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		System.out.println("Chrome Browser launched Successfully ");
		
		driver.manage().window().maximize();
				
		driver.get("https://www.spicejet.com/");
		
		System.out.println("Browser navigated to SPICEJET Successfully ");
		
		System.out.println(driver.getTitle());
		
		System.out.println("Browser Title retrieved Successfully ");
		
		
	
	}
	
	

}
