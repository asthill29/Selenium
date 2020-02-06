package com.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.CommonMethods;

public class TC1 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		
		setUp("Chrome", "https://the-internet.herokuapp.com");
		driver.findElement(By.linkText("Dynamic Loading")).click();
		driver.findElement(By.xpath("//a[text()='Example 1: Element on page that is hidden']")).click();
		driver.findElement(By.xpath("//button[text()='Start']")).click();
		
	WebDriverWait wait = new WebDriverWait (driver,30);
	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//h4[text()='Hello World!']")));
	boolean display=driver.findElement(By.xpath("//h4[text()='Hello World!']")).isDisplayed();
	System.out.println(display);
		
		
	driver.quit();
	}

}
