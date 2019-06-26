package Practise_Package;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AAAGoogleReCaptcha {

public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.gecko.driver","C://UDEMY_Selenium//Web Drivers//geckodriver.exe");
	
	WebDriver driver= new FirefoxDriver();
	
	
	System.out.println(" Firefox Browser launched Successfully ");
	
driver.get("https://patrickhlauke.github.io/recaptcha/");

driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);

int number = findFrameNumber(driver, By.cssSelector(".recaptcha-checkbox-checkmark"));

driver.switchTo().frame(number);

driver.findElement(By.cssSelector(".recaptcha-checkbox-checkmark")).click();

driver.switchTo().defaultContent();

driver.switchTo().parentFrame();
Thread.sleep(2000);

int number1 = findFrameNumber(driver, By.cssSelector("#recaptcha-reload-button"));
driver.switchTo().frame(number1);
driver.findElement(By.cssSelector(".button-holder.reload-button-holder")).click();

}

public static int findFrameNumber(WebDriver driver, By by) {

int i;
int element = driver.findElements(By.tagName("iframe")).size();

for (i = 0; i < element; i++) {

driver.switchTo().frame(i);

int count = driver.findElements(by).size();
if (count > 0) {
break;
} else {
System.out.println("Not Present Element into the frame: " + i);
driver.switchTo().defaultContent();///////////
}

}

driver.switchTo().defaultContent();
return i;
}

}