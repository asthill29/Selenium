package com.class05;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class TC1 extends CommonMethods{

	public static final String SYNTAX_PRACTICE_URL = "http://jiravm.centralus.cloudapp.azure.com:8081/index.html";
	public static void main(String[] args) throws InterruptedException {
		//The method is opening syntax Practice website using chrome browser
		CommonMethods.setUp("chrome", SYNTAX_PRACTICE_URL);
		
		
		driver.findElement(By.xpath("//a[@href='#' and text()='Alerts & Modals']")).click();
		driver.findElement(By.linkText("Javascript Alerts")).click();
//		
//		
//		driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']")).click();
//		
//	   Alert alert=driver.switchTo().alert();
//	   System.out.println(alert.getText());
//	   
//	   driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']")).click();
//	   Alert alert1=driver.switchTo().alert();
//	   Thread.sleep(2000);
//	   System.out.println("Text of Second Alert: "+alert1.getText());
//		
//		
//	   driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();
//	   Alert alert2=driver.switchTo().alert();
//		
//		//Send some text to alert box
//		alert2.sendKeys("Ayleen");
//		
//		alert2.accept();
//		boolean isDisplayed=driver.findElement(By.id("prompt-demo")).isDisplayed();
//		System.out.println(isDisplayed);
	   
	   
	   
	   

	}

}
