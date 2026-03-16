package seleniumbasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MutipleWindowHandling extends Base {

	public void verifyMultipleWindow()
	{
		driver.navigate().to("https://demo.guru99.com/popup.php");
		String firstWindow = driver.getWindowHandle();
		
		WebElement clickhere = driver.findElement(By.xpath("//a[text()= 'Click Here']"));
		clickhere.click();
		
		Set<String> handleid = driver.getWindowHandles();
		System.out.println(handleid);
		
		Iterator<String> it = handleid.iterator();
		while(it.hasNext())
		{
			
			String currentId = it.next();
			if(!currentId.equals(firstWindow))
			{
				driver.switchTo().window(currentId);
				WebElement email = driver.findElement(By.name("emailid"));
				email.sendKeys("sangeeth134@gmail.com");
				WebElement submit = driver.findElement(By.name("btnLogin"));
				submit.click();
			}
			
		}
		
		
		
	}
	
	public static void main(String[] args) {
	
		MutipleWindowHandling windowhandle = new MutipleWindowHandling();
		windowhandle.browserLaunch();
		windowhandle.verifyMultipleWindow();
		

	}

}
