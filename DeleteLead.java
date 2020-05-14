package SelDay2Week2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {
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
		driver.findElementByXPath("//span[text()='Phone']").click();
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("2");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
Thread.sleep(2000);
WebElement e=driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
String leadID=e.getText();

e.click();
driver.findElementByXPath("//a[text()='Delete']").click();
Thread.sleep(2000);
driver.findElementByXPath("//a[text()='Find Leads']").click();
driver.findElementByXPath("//input[@name='id']").sendKeys(leadID);
driver.findElementByXPath("//button[text()='Find Leads']").click();
Thread.sleep(2000);
System.out.println(driver.findElementByXPath("//div[@class='x-paging-info']").getText());
System.out.println(leadID+" LeadID is deleted ");
driver.close();

		
		
		
}

}
