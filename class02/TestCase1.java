package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
	WebDriver driver=new ChromeDriver();
	driver.get("http://newtours.demoaut.com");
	driver.findElement(By.name("mouseout")).click();
	driver.findElement(By.name("firstName")).sendKeys("Ayleen");
	driver.findElement(By.name("lastName")).sendKeys("St Hill");	
	driver.findElement(By.name("phone")).sendKeys("123-456-7890");	
	driver.findElement(By.name("adress1")).sendKeys("Ayleen");
	driver.findElement(By.name("city")).sendKeys("Ayleen");
	driver.findElement(By.name("state")).sendKeys("Ayleen");
	driver.findElement(By.name("postalCode")).sendKeys("");
	driver.findElement(By.id("email")).sendKeys("");
	driver.findElement(By.name("password")).sendKeys("");
	driver.findElement(By.name("confirmPassword")).sendKeys("");
	
	}

}
