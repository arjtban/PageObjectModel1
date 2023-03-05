package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Class1 {

	WebDriver driver;
	public Class1(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//WebElement login=driver.findElement(By.id("pt-login-2"));

	//Pagefactory.
	@FindBy(id="pt-login-2")
	WebElement login;
	
	@FindBy(name="wpName")
	WebElement username;
	
	@FindBy(name="wpPassword")
	WebElement password;
	
	@FindBy(xpath="//button[@id='wpLoginAttempt']")
	WebElement button;
	
	public void gotologin(String user,String pass) {
		login.click();
		username.sendKeys(user);
		password.sendKeys(pass);
		button.click();
	}
	
}
