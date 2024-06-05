package selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/dropdowns");
		WebElement dropdownElement = driver.findElement(By.id("fruits"));
		
		Select dropdown = new Select(dropdownElement);
		
		dropdown.selectByIndex(2);
		dropdown.selectByValue("3");//banana
		dropdown.selectByVisibleText("Mango");
		
		
	List<WebElement> options = dropdown.getOptions();
	int size=options.size();
	System.out.println(size);
	
//	for(WebElement option:options) {
//		System.out.println(option.getText());
//	}
//	
//	
//	for(int i=0;i<size;i++) {
//	options.get(i).getText();
//		
//	}
	
	
	
	WebElement headear = driver.findElement(By.className("container"));
System.out.println(headear.getText());
	}
}
