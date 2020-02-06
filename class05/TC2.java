package com.class05;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class TC2 extends CommonMethods{
	
	public static final String SYNTAX_PRACTICE_URL = "http://jiravm.centralus.cloudapp.azure.com:8081/index.html";

	public static void main(String[] args) {
		
		CommonMethods.setUp("chrome", SYNTAX_PRACTICE_URL);
		
		driver.findElement(By.linkText("Others")).click();
		driver.findElement(By.linkText("Iframe")).click();
		driver.switchTo().frame("FrameOne");
		driver.findElement(By.linkText("Home")).click();
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("FrameTwo");
		boolean display=driver.findElement(By.xpath("//img[@class='custom-logo'] ")).isDisplayed();
		System.out.println(display);
		
		
		
	}

}
