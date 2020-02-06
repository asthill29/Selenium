package com.class01;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.amazon.com");
		
		final String expTitle="Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
		
		String actualTitle=driver.getTitle();
		//System.out.println(actualTitle);
		
		if(expTitle.equals(actualTitle)) {
			System.out.println(expTitle);
		}else {
			System.out.println("They do not match");	
		}
		
	
		driver.close();
		
	}

}
