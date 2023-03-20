package com.nykaa.nykaa_product_list;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class nyakaa {
	
	public static void productselection() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("start-maximized");
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://www.nykaa.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(2000);
		
//        js.executeScript("window.scrollBy(0,3000)");
        
//		WebElement scrolltoview = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3](//span[text()='View All'])[1]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].scrollIntoView(true);", scrolltoview);	
		js.executeScript("window.scrollBy(0,5000)");
		
		
		WebElement productselection = driver.findElement(By.xpath("//div[text()='New at Nykaa']/following::div/following::div/descendant::div/child::div/following::div/following::div/div/div/div/div/div/div/div/div/div/div/div"));
		
		
		
		
		
		
		
		
		
		
        
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) throws InterruptedException {

		productselection();
	}

}
