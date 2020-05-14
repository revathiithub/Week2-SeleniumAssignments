package SelDay2Week2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {
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
		driver.findElementByXPath("//span[text()='Email']").click();
		driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("rev");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
Thread.sleep(2000);
WebElement e=driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
e.click();
String fn=driver.findElementByXPath("//span[@id='viewLead_firstName_sp']").getText();
String ln=driver.findElementByXPath("//span[@id='viewLead_lastName_sp']").getText();
driver.findElementByXPath("//a[text()='Duplicate Lead']").click();
System.out.println("Title of current page is "+driver.getTitle());
Thread.sleep(2000);
driver.findElementByXPath("//input[@name='submitButton']").click();
System.out.println(driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText()+" is created as duplicate");
String fn1=driver.findElementByXPath("//span[@id='viewLead_firstName_sp']").getText();
String ln1=driver.findElementByXPath("//span[@id='viewLead_lastName_sp']").getText();
if(fn.equals(fn1)&& ln.equals(ln1))
	System.out.println("Duplicate lead name is same as Captured name "+fn+" "+ln);

Thread.sleep(2000);
driver.close();

}
}