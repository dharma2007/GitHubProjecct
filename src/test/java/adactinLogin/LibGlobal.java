package adactinLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {
	WebDriver driver;

	public String type(WebElement e, String s) {
		e.sendKeys(s);
		return s;

	}
	public void click(WebElement e) {
		e.click();
	}

	public void getDriver() {
		
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		}
	
	public void selectaction(WebElement e, String a) {
		
		Select s = new Select(e);
		s.selectByValue(a);

	}
	
	
}
