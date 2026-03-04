package seleniumbasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingAlerts extends Base{
	
	public void SimpleAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement simplealert = driver.findElement(By.id("alertButton"));
		simplealert.click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();

	}
	
	public void verifyConfirmAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement confirmalert = driver.findElement(By.id("confirmButton"));
		confirmalert.click();
		
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HandlingAlerts alert = new HandlingAlerts();
		alert.browserLaunch();
		//alert.SimpleAlert();
		alert.verifyConfirmAlert();
	}

}
