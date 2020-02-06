package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC2 {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login\\\\n");
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("VanEarl");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		WebElement logo=driver.findElement(By.xpath("//span[@id='spanMessage']"));
		System.out.println(logo.isDisplayed());

	}

}
