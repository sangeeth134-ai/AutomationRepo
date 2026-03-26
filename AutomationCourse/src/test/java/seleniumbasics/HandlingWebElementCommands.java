package seleniumbasics;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingWebElementCommands  extends Base {

	public void verifyWebElement()
	{
		
	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	WebElement messagebox =  driver.findElement(By.id("single-input-field"));
	messagebox.sendKeys("Test Message");
	
	WebElement button1 = driver.findElement(By.id("button-one"));
	System.out.println(button1.isDisplayed());
	System.out.println(button1.isEnabled());

	//apply explicit wait
	WebDriverWait wait = new  WebDriverWait(driver, Duration.ofSeconds(5));
	wait.until(ExpectedConditions.elementToBeClickable(button1));
	
	//fluent Wait
	
	Wait<WebDriver> fluent = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(5)).pollingEvery(Duration.ofSeconds(1))
			.ignoring(NoSuchElementException.class);
	fluent.until(ExpectedConditions.elementToBeClickable(button1));
	
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
