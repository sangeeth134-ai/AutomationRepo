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
	
	public void verifyCheckBox()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement checkbox = driver.findElement(By.xpath("//input[@value=\"option-1\"]"));
		System.out.println(checkbox.isSelected());
		checkbox.click();
	}
	
	public void verifyRadioButton()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement radio = driver.findElement(By.xpath("//input[@value='blue']"));
		radio.click();
	}
	
	public static void main(String[] args) {

		HandlingDropdownCheckBoxRadioButton drop = new HandlingDropdownCheckBoxRadioButton();
		drop.browserLaunch();
		//drop.verifyDropDown();
		//drop.verifyCheckBox();
		drop.verifyRadioButton();
	}

}
