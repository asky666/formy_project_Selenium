package com.formy.selenium.actions;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\selenium-java-3.12.0\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/switch-window");
		driver.findElement(By.id("new-tab-button")).click();
		
		//Set<String> Handles = driver.getWindowHandles();
		
		for (String Handles:driver.getWindowHandles()) {
			driver.switchTo().window(Handles);
			System.out.println("handle "+Handles);
			System.out.println("title "+driver.getCurrentUrl());
		}
			
	}

}
