package com.formy.selenium.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium-java-3.12.0\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/scroll");
		
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.id("name")));
		driver.findElement(By.id("name")).sendKeys("Ashutosh");		
		driver.findElement(By.id("date")).sendKeys("07/29/1986");
		
		
		//driver.quit();
	}

}
