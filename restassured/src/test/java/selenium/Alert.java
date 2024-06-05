package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

WebDriver	driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.cssSelector("button[onclick='jsAlert()']")).click();
		org.openqa.selenium.Alert al = driver.switchTo().alert();
		
		String displayText = al.getText();
		
		System.out.println(displayText);
		Thread.sleep(2000);
		al.accept();
		
	
		
		
		driver.findElement(By.cssSelector("button[onclick='jsConfirm()']")).click();
	
	org.openqa.selenium.Alert conformal = driver.switchTo().alert();
	conformal.dismiss();
	
	driver.findElement(By.cssSelector("button[onclick='jsPrompt()']")).click();
	
	org.openqa.selenium.Alert promtptAlert = driver.switchTo().alert();
	Thread.sleep(3000);
	
	promtptAlert.sendKeys("shadab");
	
	promtptAlert.accept();
	
	
	
	}

}
