package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFileUpload extends Base{
	
	public void verifyFileUploadUsingSendKeys()
	{
		
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement fileupload = driver.findElement(By.id("uploadfile_0"));
		fileupload.sendKeys("/Users/silpasureshbabu/git/AutomationRepo/AutomationCourse/src/test/resources/Meet - rvu-pcex-yqk.pdf");
		WebElement terms = driver.findElement(By.id("terms"));
		terms.click();
		WebElement submit = driver.findElement(By.id("submitbutton"));
		submit.click();
	}

	public static void main(String[] args) {
	
		HandlingFileUpload upload = new HandlingFileUpload();
		upload.browserLaunch();
		upload.verifyFileUploadUsingSendKeys();

	}

}
