package SelDay2Week2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		Select s=new Select(driver.findElementByXPath("//select[@id='dropdown1']"));
		s.selectByIndex(1);
		
		Select s1=new Select(driver.findElementByXPath("//select[@name='dropdown2']"));
		s1.selectByVisibleText("Appium");
		
		Select s2=new Select(driver.findElementByXPath("//select[@name='dropdown3']"));
		s2.selectByValue("3");
		Select s3=new Select(driver.findElementByXPath("//select[@class='dropdown']"));
		System.out.println("No.of elements in dropdown is "+s3.getOptions().size());
		driver.findElementByXPath("(//div[@class='example'])[5]/select").sendKeys("UFT/QTP");
	driver.findElementByXPath("(//option[text()='Selenium'])[6]").click();
	driver.findElementByXPath("(//option[text()='Loadrunner'])[6]").click();
	
	Thread.sleep(2000);
	driver.close();
	}
}
