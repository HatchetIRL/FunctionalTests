package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage{
	private WebDriver driver;
	
	private By emailId = By.id("userEmail");
	private By passwordId = By.id("userPassword");
	private By loginBtn = By.id("login");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public HomePage login(String email, String password) {
		driver.findElement(emailId).sendKeys(email);
		driver.findElement(passwordId).sendKeys(password);
		driver.findElement(loginBtn).click();
		return new HomePage(driver);
	}
	

}
