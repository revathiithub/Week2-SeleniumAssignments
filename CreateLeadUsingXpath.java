package SelDay2Week2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadUsingXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
	
		driver.findElementByXPath("//input[@id='username']").sendKeys("DemosalesManager");
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");	
	driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
	driver.findElementByXPath("//a[contains(text(),'CRM/SFA')]").click(); 
	driver.findElementByXPath("//a[text()='Leads']").click(); 	
	driver.findElementByXPath("//a[text()='Create Lead']").click();
	
	driver.findElementByXPath("//input[@id='createLeadForm_companyName']").sendKeys("Company Name");
	driver.findElementByXPath("//input[@id='createLeadForm_firstName']").sendKeys("Firstname");
	driver.findElementByXPath("//input[@id='createLeadForm_lastName']").sendKeys("Lastname");
	driver.findElementByXPath("//input[@id='createLeadForm_primaryEmail']").sendKeys("rev6@test.com");
	driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneNumber']").sendKeys("1234567890");
	Select s=new Select(driver.findElementByXPath("//select[@id='createLeadForm_dataSourceId']"));
	s.selectByVisibleText("Employee");
	
	driver.findElementByXPath("//input[@name='submitButton']").click();
	System.out.println(driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText()+" is created");
	Thread.sleep(2000);
		driver.close();
	}
}
