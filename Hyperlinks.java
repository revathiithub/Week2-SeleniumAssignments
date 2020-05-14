package SelDay2Week2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hyperlinks {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Link.html");
		driver.findElementByLinkText("Go to Home Page").click();
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
	
		WebElement e=	driver.findElementByPartialLinkText("without clicking me?");
		System.out.println("Attribute value of href is :"+e.getAttribute("href"));;
		driver.findElementByXPath("//a[text()='Verify am I broken?']").click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		
		driver.findElementByXPath("(//a[contains(text(),'Go to Home Page')])[2]").click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		//WebElement[] e=driver.findElementsByXPath("a");
		
		
		
		
		
		
	}

}
