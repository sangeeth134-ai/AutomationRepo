package seleniumbasics;

import org.openqa.selenium.By;

public class HandlingLocators  extends Base{
	
	public void verifyLocators()
	{
		driver.findElement(By.id("single-input-field"));
		driver.findElement(By.className("form-control"));
		driver.findElement(By.tagName("input"));
		driver.findElement(By.name("viewport"));
		driver.findElement(By.linkText("Simple Form Demo"));   //Only use in links
		driver.findElement(By.partialLinkText("Simple"));      //Only use in links
		
		driver.findElement(By.cssSelector("input[id='single-input-field']"));
		driver.findElement(By.xpath("//button[@id='button-one']"));
		driver.findElement(By.xpath("//button[text()='Show Message']"));
		driver.findElement(By.xpath("//button[starts-with(text(),'Show ')]"));
		driver.findElement(By.xpath("//button[@id='button-one' and @type='button']"));
		driver.findElement(By.xpath("//button[@id='button-one' or @id='button-one-electronics']"));
		driver.findElement(By.xpath("//div[contains (text(), 'Single Input Field')]//parent::div[@class='card']"));
		driver.findElement(By.xpath("//div[@class='card']//child::button[@id='button-one']"));
		
		driver.findElement(By.xpath("//button[@id='button-one']//following::div[@class='card']"));  //chances for more than 1
		driver.findElement(By.xpath("//button[@id='button-one']//preceding::div[@class='card']"));
		driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div"));
		driver.findElement(By.xpath("//div[@class='card']//descendant::div"));
		
		//html/body/section/div/div/div[2]/div[2]/div/div[2]/form/div[1]/input
		
		
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingLocators hl = new HandlingLocators();
		

	}

}
