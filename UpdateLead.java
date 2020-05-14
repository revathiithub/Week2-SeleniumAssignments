package SelDay2Week2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdateLead {
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
		//driver.findElementByXPath("//input[@class=' x-form-text x-form-field ']").sendKeys("Gopi");this is not working due to multiple mathes
	driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Revathi");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
	Thread.sleep(2000);//waiting to load the search results
	driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
	Thread.sleep(2000);
	driver.findElementByXPath("//a[text()='Edit']").click();
	WebElement e=driver.findElementById("updateLeadForm_companyName");
	e.clear();
	String s="CmpnyLimited3";
	e.sendKeys(s);
		Thread.sleep(2000);
	driver.findElementByXPath("//textarea[@id='updateLeadForm_importantNote']/following::input[1]").click();
	WebElement e1=driver.findElementById("viewLead_companyName_sp");
	String[] newCompanyName=e1.getText().split(" ");
if(newCompanyName[0].equals(s))
		System.out.println("New Company name is "+newCompanyName[0]);
else
	System.out.println("New company name not updated");
Thread.sleep(2000);
driver.close();

		
		
		
}

}
