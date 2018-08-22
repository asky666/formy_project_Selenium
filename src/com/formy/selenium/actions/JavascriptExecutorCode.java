package com.formy.selenium.actions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorCode {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\selenium-java-3.12.0\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/modal");
		
		//Click on Open Modal Button to open a Modal dialog box
		driver.findElement(By.id("modal-button")).click();
		
		Thread.sleep(100);
		//Click on Close button on the Modal dialogue box using JavascriptExecutor
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", driver.findElement(By.id("close-button")));
		
		//alert.accept();
	}

}
