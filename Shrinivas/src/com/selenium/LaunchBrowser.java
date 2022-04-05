package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","D:\\Velocity\\chromedriver_win32 (1)\\chromedriver.exe");
					
					WebDriver driver=new ChromeDriver();
					
					driver.get("https://www.google.com");
					String str=driver.getTitle();
					System.out.println(str);
					driver.close();

	}

}
