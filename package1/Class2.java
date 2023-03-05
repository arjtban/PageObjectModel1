package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/home/arijit/Documents/WebDrivers/chromedriver");	
		WebDriver driver= new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Main_Page");
		Class1 obj1=new Class1(driver);	
		obj1.gotologin("ABCD","abc@123");
		
	}

}
