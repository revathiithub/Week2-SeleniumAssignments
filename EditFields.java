package SelDay2Week2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditFields {

public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	ChromeDriver driver= new ChromeDriver();
	
	driver.get("http://www.leafground.com/pages/Edit.html");
	driver.findElementById("email").sendKeys("test@gmailid.com");
	driver.findElementByXPath("(//input)[2]").sendKeys("hello",Keys.TAB);
	Thread.sleep(2000);
	System.out.println("Default text is "+driver.findElementByXPath("(//input)[3]").getAttribute("value"));
	driver.findElementByXPath("(//input)[4]").clear();
boolean r=driver.findElementByXPath("(//input)[5]").isEnabled();
if (r==false)
	System.out.println("Field is disabled");
else
	System.out.println("Field is enabled");

driver.close();
	
}
}
