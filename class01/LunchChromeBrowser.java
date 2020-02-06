package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LunchChromeBrowser {
	public static String path="";
	public static void main(String[] args) throws InterruptedException {

	String path="";
		//					Key							Value
		System.setProperty("webdriver.chrome.driver", "driversf/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		//http--> hypertext transfer protocol 
		driver.get("http://google.com");
		
		
		
		
		
		
	}

}
