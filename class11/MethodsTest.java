package com.class11;

import com.utils.CommonMethods;

public class MethodsTest extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		setUp("driver","https://expedia.com");
		
		jsScrollDown(1000);
		Thread.sleep(3000);
		jsScrollUp(500);
		Thread.sleep(3000);
		driver.quit();
		
		
		
		
	}

}
