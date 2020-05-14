package SelDay2Week2;

import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.findElementByXPath("//label[text()='Select the languages that you know?']/following::input[1]").click();
		driver.findElementByXPath("//label[text()='Select the languages that you know?']/following::input[4]").click();
		
		if(driver.findElementByXPath("//label[text()='Confirm Selenium is checked']/following::input[1]").isSelected())
			System.out.println("Selenium is Checked");
		
		/*//unchecking selenium and checking if it is checked
		driver.findElementByXPath("//label[text()='Confirm Selenium is checked']/following::input[1]").click();
		if(driver.findElementByXPath("//label[text()='Confirm Selenium is checked']/following::input[1]").isSelected())
			System.out.println("Selenium is Checked");
		else
			System.out.println("Selenium is unchecked");*/
		
		driver.findElementByXPath("//label[text()='DeSelect only checked']/following::input[2]").click();
		
	
		
		for(int i=1;i<=5;i++)
		{
			driver.findElementByXPath("//label[contains(text(),'Select all below checkboxes ')]/following::input["+i+"]").click();
		}
		
	}

}
