package armour;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;





public class BrowserNavigation {

	
	@Test
	void navigate() {
WebDriver	driver=new ChromeDriver();
	driver.navigate().to("https://demoqa.com/");
	driver.navigate().to("https://demoqa.com/elements");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	
	driver.close();
	System.out.println(driver.getWindowHandle());
	}
	
	//driver.navigate.to("https://demoqa.com/");
	
	
	
}
