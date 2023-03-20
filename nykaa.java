package com.nykaa.nykaa_product_list;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice.Argument;

public class nykaa {

	private static void nykaaproduct() throws InterruptedException {
		WebDriverManager.chromedriver().setup();	
        ChromeOptions opt = new ChromeOptions();
//	    opt.addArguments("start-maximized");
	    WebDriver driver = new ChromeDriver(opt);
		driver.get("https://www.nykaa.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Thread.sleep(3000);

		WebElement signin = driver.findElement(By.xpath("//button[text()='Sign in with Mobile / Email']"));
		signin.click();

		Thread.sleep(3000);
		WebElement mobno = driver.findElement(By.xpath("//input[@name='emailMobile']"));
		mobno.sendKeys("9566220866");

		WebElement proceed = driver.findElement(By.xpath("//button[@id='submitVerification']"));
		proceed.click();

		Thread.sleep(3000);
		Scanner s = new Scanner(System.in);
		String a = s.next();
		System.out.println(a);
//		Thread.sleep(20000);
		WebElement otp = driver.findElement(By.xpath("//input[@name='otpValue']"));
		otp.sendKeys(a);

		WebElement verify = driver.findElement(By.xpath("//button[@class='button big fill full ']"));
		verify.click();

//		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,8000)");
		WebElement newtonykaa = driver.findElement(By.xpath("(//div[@class=\"outline-wrapper\"])[30]"));
		js.executeScript("arguments[0].scrollIntoView();", newtonykaa);

		Thread.sleep(2000);
		WebElement product = driver.findElement(By
				.xpath("(//div[text()='New at Nykaa']/following::div/descendant::div/div[@class='product-name'])[1]"));
		product.click();

		WebElement proceed1 = driver.findElement(By.xpath("//span[text()='Add to Bag']"));
		proceed1.click();
		Thread.sleep(3000);

		WebElement baggy = driver.findElement(By.xpath("//span[@class='cart-count']"));
		baggy.click();

		Thread.sleep(3000);
		WebElement frames = driver.findElement(By.xpath("//iframe[@class='css-acpm4k']"));
		driver.switchTo().frame(frames);

		WebElement proceed2 = driver.findElement(By.xpath("//*[@id='app']/div/div/div[3]/div/div/div/div[2]/button"));
		proceed2.click();
		driver.switchTo().defaultContent();

		Thread.sleep(1000);
//		driver.findElement(By.xpath("//button[text()='Continue as guest']")).click();

		WebElement address = driver.findElement(By.xpath("//p[text()='Add New Address']"));
		address.click();
//		address.sendKeys("no.6289,TNHB,LIG-2,ayapakkam,chennai-77");
		WebElement houseno = driver.findElement(By.xpath("//input[@placeholder='House/ Flat/ Office No.']"));
		houseno.click();
		houseno.sendKeys("No.6289,hossana complex");

		Thread.sleep(2000);
		WebElement restoftheaddress = driver.findElement(By.xpath("//div[@class='inner-wrap']//textarea"));
//		restoftheaddress.click();
		restoftheaddress.sendKeys("TNHB,LIG-2,ayapakkam,chennai");

		WebElement name = driver.findElement(By.xpath("//input[@placeholder='Name']"));
		name.sendKeys("G arul dass james");
		
		WebElement phoneno = driver.findElement(By.xpath("//input[@placeholder='Phone']"));
		phoneno.sendKeys("9566220866");

		WebElement mailid = driver.findElement(By.xpath("//input[@placeholder='Email ID (Optional)']"));
		mailid.sendKeys("aruldassjamesg@gmail.com");
		
		driver.findElement(By.xpath("//input[@placeholder='Pincode']")).sendKeys("600077");

		Thread.sleep(3000);
		WebElement addtocart = driver.findElement(By.xpath("//button[text()='Ship to this address']"));
		
		Thread.sleep(3000);
		WebElement ccNum = driver.findElement(By.xpath("//input[@placeholder='Card Number']"));
		js.executeScript("arguments[0].value='4320716143344949';", ccNum);

		
		Thread.sleep(2000);
		WebElement expDate = driver.findElement(By.xpath("//input[@placeholder='Expiry (MM/YY)']"));
		js.executeScript("arguments[0].value='032024';", expDate);
		
		Thread.sleep(2000);
		WebElement cvv = driver.findElement(By.xpath("//input[@placeholder='CVV']"));
		js.executeScript("arguments[0].value='007';", cvv);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Pay ₹')]")).click();
		
	}

	public static void main(String[] args) throws InterruptedException {
		System.out.println(args);
		nykaaproduct();
	}

}
