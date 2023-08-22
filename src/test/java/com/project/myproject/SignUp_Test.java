package com.project.myproject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUp_Test {
	
	public void signUp_click(WebDriver driver) throws InterruptedException {
		
		driver.findElement(By.id("signin2")).click();
		Thread.sleep(2000);
	}
	
	public void sign_user(WebDriver driver, String username1) throws InterruptedException {
		driver.findElement(By.id("sign-username")).sendKeys(username1);
		Thread.sleep(2000);
	}
	
	public void sign_pass(WebDriver driver, String Pass1) throws InterruptedException {
		driver.findElement(By.id("sign-password")).sendKeys(Pass1);
		Thread.sleep(2000);
	}
	
	
	
	public void sign_submit(WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")).click();
		Thread.sleep(2000);
		
	}
	
	public void Alert(WebDriver driver) throws InterruptedException {
		
		Alert a1 = driver.switchTo().alert();
		System.out.println(" Alert message:...."+a1.getText());
		Thread.sleep(5000);

		if (a1.getText().equals("This user already exist.")) {
			
			a1.accept();
			driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/button/span")).click();
			Thread.sleep(2000);
			
		}else if (a1.getText().equals("Sign up successful.")) {
			
			a1.accept();
			
		} 	
	}
}
