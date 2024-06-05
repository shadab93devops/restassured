package armour;

import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class login {

	WebDriver 	driver= new ChromeDriver();
	@Test
	void login() throws InterruptedException {
		driver.get("https://demoqa.com/elements");
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());
		
		
	WebElement logo = driver.findElement(By.xpath("//*[@id=\"app\"]/header/a/img"));
		System.out.println(logo.isDisplayed());
		Thread.sleep(3000);
		
		
		driver.get("https://demoqa.com/text-box");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(3000);
		
		WebElement inputelement = driver.findElement(By.id("userName"));
		System.out.println(inputelement.isEnabled());
		driver.get("https://demoqa.com/checkbox");
		WebElement checkBox = driver.findElement(By.xpath("//span[@class=\"rct-title\"]"));
		checkBox.click();
		Thread.sleep(3000);
		System.out.println(checkBox.isSelected());
		driver.quit();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
