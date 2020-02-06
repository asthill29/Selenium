package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class TestCase1 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		
		CommonMethods.setUp("chrome", "http://166.62.36.207/syntaxpractice/index.html");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Input Forms']")).click();
		driver.findElement(By.linkText("Radio Buttons Demo")).click();
		WebElement maleRadioB = driver.findElement(By.xpath("//input[@name='optradio' and @value='Male']"));
		maleRadioB.click();
		System.out.println(maleRadioB.isSelected());
		
//WebElement ageRadio = driver.findElement(By.xpath("//input[@name='optradio' and @value='Male']"));
		
	}

}
