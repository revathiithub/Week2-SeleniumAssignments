package SelDay2Week2;

import org.openqa.selenium.chrome.ChromeDriver;

public class FindFirstLead {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
	
		driver.findElementByXPath("//input[@id='username']").sendKeys("DemosalesManager");
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");	
	driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
	driver.findElementByXPath("//a[contains(text(),'CRM/SFA')]").click(); 
	driver.findElementByXPath("//a[text()='Leads']").click();
	driver.findElementByXPath("//a[text()='Find Leads']").click();
}
}

