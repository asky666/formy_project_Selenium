package com.formy.selenium.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoComplete {
	public static void main(String args[]) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\selenium-java-3.12.0\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://formy-project.herokuapp.com/autocomplete");
			
			driver.findElement(By.id("autocomplete")).sendKeys("3784 woodruff");
			
			Thread.sleep(1000);
			
			driver.findElement(By.className("pac-item")).click();
			
			//driver.quit();
		
	}
}
