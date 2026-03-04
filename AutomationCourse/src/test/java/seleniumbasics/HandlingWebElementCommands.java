package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingWebElementCommands  extends Base {

	public void verifyWebElement()
	{
		
	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	WebElement messagebox =  driver.findElement(By.id("single-input-field"));
	messagebox.sendKeys("Test Message");
	
	WebElement button1 = driver.findElement(By.id("button-one"));
	System.out.println(button1.isDisplayed());
	System.out.println(button1.isEnabled());

	button1.click();
	
	WebElement yourmessage = driver.findElement(By.id("message-one"));
	System.out.println(yourmessage.getText());
	
	messagebox.clear();
		
	}
	
	public static void main(String[] args) {
	HandlingWebElementCommands  webelements = new HandlingWebElementCommands();
	webelements.browserLaunch();
	
	webelements.verifyWebElement();

	}

}
