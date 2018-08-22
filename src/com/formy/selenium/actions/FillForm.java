package com.formy.selenium.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FillForm {
	public static void main(String args[]) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\selenium-java-3.12.0\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://formy-project.herokuapp.com/form");
			
			submitForm(driver);
			
			waitForAlertBanner(driver);	
	
			System.out.println ("Alert banner is : " +	getAlertBannerText(driver));
			
			//driver.quit();	
	}	
	
	public static void submitForm(WebDriver driver) {
				
		driver.findElement(By.id("first-name")).sendKeys("Ashutosh");
		driver.findElement(By.id("last-name")).sendKeys("Sharma");
		driver.findElement(By.id("job-title")).sendKeys("Automation QA");
		driver.findElement(By.id("radio-button-2")).click();
		driver.findElement(By.id("checkbox-1")).click();

		Select ExperienceDropdown = new Select (driver.findElement(By.id("select-menu")));
		ExperienceDropdown.selectByValue("3");
		
		driver.findElement(By.id("datepicker")).sendKeys("03/03/1999");
		driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
		
		//driver.findElement(By.xpath("//a[@class='btn btn-lg btn-primary']")).click(); // OR use the CSS selector below
		driver.findElement(By.cssSelector("a.btn.btn-lg.btn-primary")).click();
	}
	
	public static void waitForAlertBanner(WebDriver driver) {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.alert.alert-success")));
	}

	
	public static String getAlertBannerText(WebDriver driver) {
		
		return driver.findElement(By.cssSelector("div.alert.alert-success")).getText();
	}
}
