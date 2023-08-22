package com.project.myproject;

import java.io.File;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class Cart_Test {


	public void selectProduct(WebDriver driver) throws InterruptedException {

		driver.findElement(By.id("itemc")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[5]/div/a/img")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//div[@class='item active']//img")).click();
		Thread.sleep(2000);

		driver.findElement(By.partialLinkText("Add to cart")).click();
		Thread.sleep(3000);

		Alert al1 = driver.switchTo().alert();
		al1.accept();
		
		driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[1]/a")).click();
		Thread.sleep(3000);

		driver.findElement(By.partialLinkText("Monitors")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")).click();
		Thread.sleep(3000);

		Alert al2 = driver.switchTo().alert();
		al2.accept();

		driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[1]/a")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[normalize-space()='Nokia lumia 1520']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")).click();
		Thread.sleep(2000);

		Alert al3 = driver.switchTo().alert();
		al3.accept();

		driver.findElement(By.id("cartur")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[4]/a")).click();
		Thread.sleep(2000);

	}
	
	public void cart_Details(WebDriver driver,String name, String country, String City, String CardNo, String month, String year) throws Exception {
		
		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button")).click();
		
		Thread.sleep(3000);
	
		driver.findElement(By.id("name")).sendKeys(name);
		Thread.sleep(3000);
		driver.findElement(By.id("country")).sendKeys(country);
		Thread.sleep(3000);
		driver.findElement(By.id("city")).sendKeys(City);
		Thread.sleep(3000);
		driver.findElement(By.id("card")).sendKeys(CardNo);
		Thread.sleep(3000);
		driver.findElement(By.id("month")).sendKeys(month);
		Thread.sleep(3000);
		driver.findElement(By.id("year")).sendKeys(year);
		Thread.sleep(3000);
		
		File file1=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(file1, new File("E:\\Selenium\\ScreenShot\\Invalid_details.png"));
		Thread.sleep(5000);
		//E:\\f drive\\eclipse\\myproject\\target\\ScreenShot
		
		driver.findElement(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]")).click();
		Thread.sleep(3000);
				
		File file=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(file, new File("E:\\Selenium\\ScreenShot\\InvaliCard_success.png"));
		Thread.sleep(5000);
		//E:\\f drive\\eclipse\\myproject\\target\\ScreenShot\\
		
		driver.findElement(By.xpath("/html/body/div[10]/div[7]/div/button")).click();
		Thread.sleep(3000);
		
		
		
	}
	
	public void close(WebDriver driver) throws InterruptedException {
		
		driver.findElement(By.id("logout2")).click();
		Thread.sleep(5000);
		
		
	}
}
