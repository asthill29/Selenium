package com.class10;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.utils.CommonMethods;

public class DragandDropHW extends CommonMethods{
	/*
	 * TC 1: Drag and Drop verification
	 * 1.Open chrome browser
	 * 2.Go to “https://jqueryui.com/”
	 * 3.Click on “Droppable” link
	 * 4.Using mouse drag “Drag me to my target” to the “Drop Here”
	 * 5.Close the browser
	 */
		

	public static void main(String[] args) throws InterruptedException {
		
		setUp("chrome","https://jqueryui.com");
		driver.findElement(By.linkText("Droppable")).click();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		
		Actions action=new Actions(driver);
		WebElement drag=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop=driver.findElement(By.xpath("//div[@id='droppable']"));
		action.dragAndDrop(drag, drop).perform();
		
		String expText=driver.findElement(By.xpath("//div[@id='droppable']/p")).getText();
		
		if (expText.contains("Dropped")) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		
		TakesScreenshot screen=(TakesScreenshot)driver;
		File sc=screen.getScreenshotAs(OutputType.FILE);
		try {
		FileUtils.copyFile(sc, new File ("screenshots/JQUERY/DragAndDrop.png"));
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		Thread.sleep(3000);
		
		driver.close();
	
	}

}
