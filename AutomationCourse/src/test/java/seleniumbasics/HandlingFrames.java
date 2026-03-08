package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFrames  extends Base {
	
	public void verifyFrame()
	{
		driver.navigate().to(" https://demoqa.com/frames");
		List<WebElement>  totalframes = driver.findElements(By.tagName("iframe")); 
	    System.out.println(totalframes.size());
		
	    WebElement frame1 = driver.findElement(By.id("frame1"));
	    driver.switchTo().frame(frame1);
	    
	    WebElement text = driver.findElement(By.id("sampleHeading"));
	    System.out.println(text.getText());
	    
	    driver.switchTo().defaultContent();
	    
	}

	public static void main(String[] args) {
		
		HandlingFrames frame = new HandlingFrames();
		frame.browserLaunch();
		frame.verifyFrame();

	}

}
