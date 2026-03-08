package seleniumbasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandlingActions extends Base {

	public void verifyRightClick()
	{
		WebElement other = driver.findElement(By.id("others"));
		Actions action = new Actions(driver);
		
		action.contextClick(other).build().perform();
	}
	
	public void verifymouseOver()
	{
		WebElement other = driver.findElement(By.id("others"));
		Actions action = new Actions(driver);
		
		action.moveToElement(other).build().perform();
	}
	
	public void verifyDragAndDrop()
	{
		driver.navigate().to("https://demoqa.com/droppable");
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		
		action.dragAndDrop(drag, drop).build().perform();
	
	}
	
	public void verifyKeyBoardAction() throws AWTException{
		Robot robot = new Robot();
	
		robot.keyPress(KeyEvent.VK_META);
		robot.keyPress(KeyEvent.VK_A);
		
		robot.keyRelease(KeyEvent.VK_META);
		robot.keyRelease(KeyEvent.VK_A);
		
		//driver.switchTo().newWindow(WindowType.TAB);
	}
	
	public static void main(String[] args)   {

		HandlingActions actions = new HandlingActions();
		actions.browserLaunch();
		//actions.verifyRightClick();
		//actions.verifymouseOver();
		//actions.verifyDragAndDrop();
		try {
			actions.verifyKeyBoardAction();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
