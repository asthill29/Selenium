package com.class09;

import org.openqa.selenium.By;

import com.utils.CommonMethods;
import com.utils.Constants;

public class task3 extends CommonMethods{

	public static void main(String[] args) {
		
		setUp("chrome", Constants.HRMS_URL);
		// login into HRMS
		String userName = "Admin";
		String password = "Hum@nhrm123";
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.linkText("Recruitment")).click();
		driver.findElement(By.linkText("//a[@id='menu_recruiment_viewRecruitmentModule']")).click();

		
				//a[@id='menu_recruiment_viewRecruitmentModule']
	}

}
