package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver	driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("https://ui.vision/demo/webtest/frames/");
		
	WebElement frame = driver.findElement(By.xpath("//frameset[1]/frame[1]"));
		
		
		driver.switchTo().frame(frame);
		driver.findElement(By.name("mytext1")).sendKeys("hello teher");
		driver.switchTo().defaultContent();
		
	WebElement frame2 = driver.findElement(By.xpath("//frame[@src=\"frame_2.html\"]"));	
	
	driver.switchTo().frame(frame2);
	driver.findElement(By.name("mytext2")).sendKeys("sdjjek");
		
	}

}
