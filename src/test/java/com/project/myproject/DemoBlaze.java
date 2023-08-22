package com.project.myproject;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import com.google.common.io.Files;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoBlaze {

	WebDriver driver = null;

	@Test(priority = 0)
	public void beforeMethod() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.demoblaze.com/");
		Thread.sleep(2000);
	}

	@Ignore
	@Test(priority = 0)
	public void signUp() throws InterruptedException {

		driver.findElement(By.id("signin2")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("sign-username")).sendKeys("yash2001");
		Thread.sleep(2000);
		driver.findElement(By.id("sign-password")).sendKeys("yash@1996");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")).click();
		Thread.sleep(2000);

		Alert a1 = driver.switchTo().alert();
		a1.accept();

	}

	@Test(priority = 1)
	public void logIn() throws InterruptedException {

		driver.findElement(By.id("login2")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("loginusername")).sendKeys("yash2001");
		Thread.sleep(2000);

		driver.findElement(By.id("loginpassword")).sendKeys("yash@1996");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
		Thread.sleep(9000);
	}
//phones
	@Test(priority = 2)
	public void phones() throws InterruptedException, IOException {
		
		Actions actions = new Actions(driver);
		WebElement phones = driver.findElement(By.linkText("Phones"));
		Action a1 = actions.moveToElement(phones).build();
		a1.perform();
		Thread.sleep(3000);

		driver.findElement(By.id("itemc")).click();
		Thread.sleep(3000);

		WebElement iphone = driver.findElement(By.linkText("Iphone 6 32gb"));
		Action a2 = actions.moveToElement(iphone).build();
		a2.perform();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[5]/div/a/img")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[@class='item active']//img")).click();
		Thread.sleep(2000);
//		File file=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		Files.copy(file, new File("/myproject/target/ScreenShot\\Picture_can't_open.png"));
//		Thread.sleep(5000);

		driver.findElement(By.partialLinkText("Add to cart")).click();
		Thread.sleep(3000);

		Alert alert = driver.switchTo().alert();
		alert.accept();
//home 		
		driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[1]/a")).click();
		Thread.sleep(3000);
	}
//Laptop		
	@Test(priority = 3)
	public void laptop() throws InterruptedException {
		
		driver.findElement(By.partialLinkText("Laptops")).click();
		Thread.sleep(3000);
		
		Actions actions1 = new Actions(driver);
		WebElement Next = driver.findElement(By.linkText("Next"));
		Action a2 = actions1.moveToElement(Next).build();
		a2.perform();
		Thread.sleep(5000);
		
		driver.findElement(By.partialLinkText("Next")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[6]/div/div/h4/a")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")).click();
		Thread.sleep(3000);

		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
//home 		
		driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[1]/a")).click();
		Thread.sleep(3000);
	}

//Monitors
	@Test(priority = 4)
	public void monitor() throws InterruptedException {

		driver.findElement(By.partialLinkText("Monitors")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")).click();
		Thread.sleep(3000);

		Alert alert2 = driver.switchTo().alert();
		alert2.accept();
	}

//cart	
	@Test(priority = 5)
	public void cart() throws InterruptedException, IOException {

		driver.findElement(By.id("cartur")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("name")).sendKeys("yash");
		Thread.sleep(3000);
		driver.findElement(By.id("country")).sendKeys("India");
		Thread.sleep(3000);
		driver.findElement(By.id("city")).sendKeys("Surat");
		Thread.sleep(3000);
		driver.findElement(By.id("card")).sendKeys("1234 4567 6789 8901");
		Thread.sleep(3000);
		driver.findElement(By.id("month")).sendKeys("04");
		Thread.sleep(3000);
		driver.findElement(By.id("year")).sendKeys("2026");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]")).click();
		Thread.sleep(3000);
		
		File file=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(file, new File("E:\\Selenium\\ScreenShot\\Invalid_card_details.png"));
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("/html/body/div[10]/div[7]/div/button")).click();
		Thread.sleep(3000);
		
		Alert alert3 = driver.switchTo().alert();
		alert3.accept();
		
	}
	@Test(priority = 6)
	public void contact() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[2]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("recipient-email")).sendKeys("yash.123@mail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("recipient-name")).sendKeys("yash");
		Thread.sleep(2000);
		driver.findElement(By.id("message-text")).sendKeys("This is yash!!!");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]")).click();
		Thread.sleep(2000);
		
		Alert alert4 = driver.switchTo().alert();
		alert4.accept();
	}
	@Test(priority = 7)
	public void aboutUs() throws InterruptedException {
		driver.findElement(By.partialLinkText("About us")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"example-video\"]/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("example-video")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"videoModal\"]/div/div/div[3]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("nava")).click();
		Thread.sleep(2000);
	}
	
	@Test(priority = 8)
	public void afterClass() throws InterruptedException {
		driver.findElement(By.id("logout2")).click();
		Thread.sleep(2000);

		driver.close();

	}

}
