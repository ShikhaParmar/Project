package com.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browserConfiguration {
	
	
		WebDriver driver=null;
		public WebDriver ChromeBrowserSelection(String browser,String URL)
		{
			if(browser.equals("chrome") || browser.equals("Chrome") || browser.equals("CHROME"))
			{
				WebDriverManager.chromedriver().setup();
				
			//	System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
				driver=new ChromeDriver();
				driver.get(URL);
			}
			return driver;
		}
		public WebDriver firefoxBrowserSelection(String browser,String URL)
		{
			if(browser.equals("firefox") || browser.equals("Firefox") || browser.equals("FIREFOX"))
			{
				WebDriverManager.chromedriver().setup();

				
			//	System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
				driver=new ChromeDriver();
				driver.get(URL);
			}
			return driver;
		}

}
