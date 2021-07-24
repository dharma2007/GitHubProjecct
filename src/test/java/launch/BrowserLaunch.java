package launch;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch {
	
	//windows handling
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		
	    driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
		
		String a = driver.getWindowHandle();
		
		Set<String> b = driver.getWindowHandles();
		
		for (String x : b) {
			
			if(!x.equals(a))
				driver.switchTo().window(x);
						
		}
		Thread.sleep(2000);
	
	WebElement cost = driver.findElement(By.id("priceblock_ourprice"));
	
	String text = cost.getText();
	
	System.out.println(text);
	
	driver.switchTo().window(a);
	
	driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[2]")).click();
	
	
	Set<String> b2 = driver.getWindowHandles();
	
	List<String> li = new ArrayList();
	li.addAll(b2);
	
	
	
	String s = li.get(2);
	
	driver.switchTo().window(s);
	
	WebElement cost1 = driver.findElement(By.id("priceblock_ourprice"));
	
	String text2 = cost1.getText();
	
	System.out.println(text2);



	}
	

}
