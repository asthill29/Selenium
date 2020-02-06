package com.class08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class InClassTask2 extends CommonMethods{

	public static void main(String[] args) {
		
		setUp("chrome", "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
		//login
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		
		List <WebElement> rows=driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr"));
		String expectedName="Susan McLaren";
		for (int i=1; i<rows.size(); i++) {
			String rowsText=rows.get(i-1).getText();
		}
		
		
		
	}

}
