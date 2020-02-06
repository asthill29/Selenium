package com.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.CommonMethods;
import com.utils.Constants;

public class ExplicitWaitDemo extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		/*Navigate to the page
		 * click on others 
		 * select dynamic data loading
		 * click Get new User
		 * verify/validate that First Name element is displayed
		 */
		
		setUp("chrome",Constants.SYNTAX_PRACTICE_URL);
		
		driver.findElement(By.linkText("Others")).click();
		driver.findElement(By.linkText("Dynamic Data Loading")).click();
		driver.findElement(By.id("save")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//p[starts-with(text(), 'First Name)]")));
		boolean display=driver.findElement(By.xpath("//p[starts-with(text(), 'First Name)]")).isDisplayed();
		if (display) {
			System.out.println("Pass");
		}else {
			System.out.println("Failed");
		}
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
