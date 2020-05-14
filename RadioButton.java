package SelDay2Week2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("http://leafground.com/pages/radio.html");
		driver.findElementById("no").click();
		Thread.sleep(2000);
		driver.findElementById("yes").click();
		WebElement checked= driver.findElementByXPath("(//input[@name='news'])[1]");
		if(checked.isSelected())
		{
			System.out.println("Default selected value is "+checked.getText());
		}
		else
		{
			System.out.println("inside else");
			checked= driver.findElementByXPath("(//input[@name='news'])[2]");
			System.out.println("Default selected value is "+checked.getText());
		}
		
		Thread.sleep(2000);
		WebElement age=driver.findElementByXPath("(//input[@name='age'])[1]");
		if(!age.isSelected())
		{
			age.click();
		}
		System.out.println("My Age group is"+age.getText());
		
		
	}

}

