package testscript;



import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.LoginPage;
import seleniumbasics.TestngBase;
import utilities.ExcelUtility;

public class LoginTest extends TestngBase{
	
	
	@Test
	public void  verifyUserLoginWithValidCredentials() throws IOException
	{
		//WebElement usernamefield = driver.findElement(By.id("user-name"));
		//usernamefield.sendKeys("standard_user");
		
		//WebElement passwordfield = driver.findElement(By.id("password"));
		//passwordfield.sendKeys("secret_sauce");
		
		//WebElement loginbutton = driver.findElement(By.id("login-button"));
		//loginbutton.click();
		String username = ExcelUtility.readStringData(0, 0, "LoginPage");
		String password = ExcelUtility.readStringData(0, 1, "LoginPage");
		
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username);
		login.enterPasswordOnPasswordField(password);
		
		login.clickOnLoginButton();
			
	}
	
	@Test
	public void  verifyUserLoginWithInvalidUsernameAndValidPassword() throws IOException
	{
		/*WebElement usernamefield = driver.findElement(By.id("user-name"));
		usernamefield.sendKeys("user1");
		
		WebElement passwordfield = driver.findElement(By.id("password"));
		passwordfield.sendKeys("secret_sauce");
		
		WebElement loginbutton = driver.findElement(By.id("login-button"));
		loginbutton.click();*/
		String username = ExcelUtility.readStringData(1, 0, "LoginPage");
		String password = ExcelUtility.readStringData(1, 1, "LoginPage");
		
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username);
		login.enterPasswordOnPasswordField(password);
		
		login.clickOnLoginButton();
			
	}

	@Test
	public void  verifyUserLoginWithInvalidPasswordandValidUsername() throws IOException
	{
		/*WebElement usernamefield = driver.findElement(By.id("user-name"));
		usernamefield.sendKeys("standard_user");
		
		WebElement passwordfield = driver.findElement(By.id("password"));
		passwordfield.sendKeys("password1");
		
		WebElement loginbutton = driver.findElement(By.id("login-button"));
		loginbutton.click();*/
			
		String username = ExcelUtility.readStringData(2, 0, "LoginPage");
		String password = ExcelUtility.readStringData(2, 1, "LoginPage");
		
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username);
		login.enterPasswordOnPasswordField(password);
		
		login.clickOnLoginButton();
	}
	
	@Test
	public void  verifyUserLoginWithInValidCredentials() throws IOException
	{
		/*WebElement usernamefield = driver.findElement(By.id("user-name"));
		usernamefield.sendKeys("user1");
		
		WebElement passwordfield = driver.findElement(By.id("password"));
		passwordfield.sendKeys("password1");
		
		WebElement loginbutton = driver.findElement(By.id("login-button"));
		loginbutton.click();*/
		
		String username = ExcelUtility.readStringData(3, 0, "LoginPage");
		String password = ExcelUtility.readStringData(3, 1, "LoginPage");
		
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username);
		login.enterPasswordOnPasswordField(password);
		
		login.clickOnLoginButton();
			
	}

}
