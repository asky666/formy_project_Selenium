package com.formy.selenium.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardAndMouse {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium-java-3.12.0\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/keypress");
		
		driver.findElement(By.id("name")).sendKeys("Ashutosh");
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("button")).click();
		
		//driver.quit();
		
	}
	
}

