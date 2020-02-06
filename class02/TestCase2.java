package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Ayleen");
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("St Hill");
		driver.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys("123467890");
		driver.findElement(By.cssSelector("input[name='reg_passwd__']")).sendKeys("name1234");
		
	
		
		
		

	}

}
