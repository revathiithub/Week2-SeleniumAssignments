package SelDay2Week2;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttons {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
		Thread.sleep(2000);
		System.out.println("Page title "+driver.getTitle());
		Thread.sleep(2000);
		driver.findElementByXPath("//button[@id='home']").click();
		System.out.println(driver.getCurrentUrl());
	//driver.navigate().back();
		driver.findElementByXPath("(//img[@class='wp-categories-icon svg-image'])[2]").click();
		Thread.sleep(2000);
System.out.println("Moved back to url :"+driver.getCurrentUrl());
	WebElement p=driver.findElementById("position");
	System.out.println("Location of the button "+p.getLocation().x+","+p.getLocation().y);

	System.out.println("Colour of button is "+driver.findElementById("color").getCssValue("background-color"));
	System.out.println("Size of button is "+driver.findElementById("size").getSize());	
	driver.close();
	}

}
