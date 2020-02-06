package com.class01;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.syntaxtechs.com");
		driver.navigate().to("https://www.google.com");
		Thread.sleep(2000);
		driver.navigate().to("https://www.syntaxtechs.com");
		driver.navigate().refresh();
		
		String title=driver.getTitle();
		if (title.contains("Syntax")) {
			System.out.println(title);
		}else {
			System.out.println("Do not contained");	
		}
		
		driver.close();

	}

}
