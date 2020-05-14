package SelDay1Week2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementById("username").sendKeys("DemosalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		
		driver.findElementByLinkText("Leads").click();
			driver.findElementByPartialLinkText("Create Lead").click();
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			driver.findElementById("createLeadForm_companyName").sendKeys("Revz Pvt Limited");
			driver.findElementById("createLeadForm_firstName").sendKeys("Revathi");
			driver.findElementById("createLeadForm_lastName").sendKeys("Sheela Devi");	
			
			Select source= new Select(driver.findElementById("createLeadForm_dataSourceId"));
			source.selectByVisibleText("Employee");
			
			Select marketingCampaign = new Select(driver.findElementById("createLeadForm_marketingCampaignId"));
			marketingCampaign.selectByValue("9001");
			
			Select ownership = new Select(driver.findElementById("createLeadForm_ownershipEnumId"));
			ownership.selectByIndex(5);
			Select country = new Select(driver.findElementById("createLeadForm_generalCountryGeoId"));
			country.selectByVisibleText("India");
			Thread.sleep(3000);
		driver.findElementByClassName("smallSubmit").click();
		System.out.println(driver.getTitle());
			driver.close();
			
		
	}
}
