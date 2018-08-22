package com.formy.selenium.actions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\selenium-java-3.12.0\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/switch-window");
		driver.findElement(By.id("alert-button")).click();
		
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert text is : "+alert.getText());
		//alert.accept();
	}
}