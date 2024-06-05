package selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
	WebDriver	driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		//checkbox->select single 
		
WebElement checkBox =driver.findElement(By.xpath("//input[@id='sunday']"));
		checkBox.click();
		
		
		
		//select all checkbox
		
	List<WebElement> CheckBoxes = driver.findElements(By.xpath("//input[@class='form-check-input'  and @type=\"checkbox\"]"));
		
		/*for(WebElement checkbox:CheckBoxes) {
			checkbox.click();
		}*/
	
		
		
		for(int i=0;i<=CheckBoxes.size()-4;i++) {
			CheckBoxes.get(i).click();
		}
		Thread.sleep(5000);
		
		
		
		for( WebElement checkbox:CheckBoxes) {
			if(checkbox.isSelected()) {
				checkbox.click();
			}
		}
		driver.close();
	}

}
