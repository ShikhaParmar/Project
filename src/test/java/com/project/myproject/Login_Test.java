package com.project.myproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_Test {

	public void logIn_click(WebDriver driver) throws InterruptedException {
		
		driver.findElement(By.id("login2")).click();
		Thread.sleep(2000);
		
	}
	public void username(WebDriver driver, String Username) throws InterruptedException {
		driver.findElement(By.id("loginusername")).sendKeys(Username);
		Thread.sleep(2000);
		
	}
	public void password(WebDriver driver,String Password) throws InterruptedException {
		driver.findElement(By.id("loginpassword")).sendKeys(Password);
		Thread.sleep(2000);
	}
	public void login_Submit(WebDriver driver) throws InterruptedException {
		
		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
		Thread.sleep(9000);
	}
	
}
