package com.main;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.browser.browserConfiguration;
import com.project.myproject.Cart_Test;
import com.project.myproject.Login_Test;
import com.project.myproject.SignUp_Test;

public class MainClass {
	
	public class MainTest 
	{
		WebDriver driver=null;
		
		SignUp_Test s1=null;
		Login_Test lp=null;
		Cart_Test a1 =null;
		
		@BeforeClass
		public void loadBrowser() throws InterruptedException
		{
			driver=new browserConfiguration().ChromeBrowserSelection("chrome", "https://www.demoblaze.com/");
			Thread.sleep(3000);
			
		}
		@BeforeTest
		public void beforetest()
		{
			s1=new SignUp_Test();
			lp=new Login_Test();
			a1=new Cart_Test();
		}
		@Test(priority = 0)
		public void SignUp_Test() throws InterruptedException
		{
			s1.signUp_click(driver);
			s1.sign_user(driver, "Shikha@1994");
			s1.sign_pass(driver, "Shikha@1994");
			s1.sign_submit(driver);
			s1.Alert(driver);
			
		}
		@Test(priority = 1)
		public void loginDetails() throws InterruptedException
		{
			lp.logIn_click(driver);
			lp.username(driver, "Shikha@1994");
			lp.password(driver, "Shikha@1994");
			lp.login_Submit(driver);
		}
		
		
		@Test(priority = 2)
		public void addToCart() throws Exception{

			a1.selectProduct(driver);
			a1.cart_Details(driver, "yash", "India", "Surat", "12345678910", "04", "2030");
			a1.close(driver);
		}
		@AfterClass
		public void closeBrowser() throws InterruptedException
		{
			System.out.println("Bye Bye...");
			Thread.sleep(3000);
			driver.close();		
		}

	}
}
