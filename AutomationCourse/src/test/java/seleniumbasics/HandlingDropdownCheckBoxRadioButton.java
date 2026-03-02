package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdownCheckBoxRadioButton extends Base {

	public void verifyDropDown()
	{
	
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement dropdown = driver.findElement(By.id("dropdowm-menu-1"));
		
		Select select = new Select(dropdown);
		//select.selectByIndex(1);
		//select.selectByValue("python");
		select.selectByVisibleText("SQL");
		
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HandlingDropdownCheckBoxRadioButton drop = new HandlingDropdownCheckBoxRadioButton();
		drop.browserLaunch();
		drop.verifyDropDown();
	}

}
