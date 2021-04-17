package newpackage;
import java.util.*;
import java.util.Timer;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class MyClass {
	WebDriver driver;
	 
	 public MyClass() throws InterruptedException
	 {

		 		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Documents\\chromedriver.exe");
	    		
	    		driver = new ChromeDriver();
	  
	    		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);

	    		driver.get("file:///D:/projeect/index.html");
	    			//Max
	    		driver.manage().window().maximize();
	    		Thread.sleep(1000);
	    		JavascriptExecutor js = ((JavascriptExecutor) driver);
		         js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		         Thread.sleep(2000);
		         JavascriptExecutor js3 = ((JavascriptExecutor) driver);
		         js3.executeScript("window.scrollTo( document.body.scrollHeight,0)");
		         Thread.sleep(5000);
		    	driver.get("file:///D:/projeect/signup.html");
	         	Thread.sleep(2000);
	         	driver.findElement(By.id("name1")).sendKeys("Mrunal");
			    Thread.sleep(2000);
			    driver.findElement(By.id("name2")).sendKeys("Milawane");
			    Thread.sleep(2000);
			    driver.findElement(By.id("mob")).sendKeys("6754352537");
			    Thread.sleep(2000);
			    driver.findElement(By.id("email1")).sendKeys("mrunalpmilawane2000@gmail.com");
			    Thread.sleep(2000);
			    driver.findElement(By.id("pass1")).sendKeys("mrunal@2000");
		        Thread.sleep(2000);
		        driver.findElement(By.id("s")).click();
		        Thread.sleep(5000);
		    
		    driver.get("file:///D:/projeect/login.html");
			   Thread.sleep(2000);
			   driver.findElement(By.id("un")).sendKeys("Mrunal");
			    Thread.sleep(2000);
			   driver.findElement(By.id("email")).sendKeys("mrunalpmilawane2000@gmail.com");
			    Thread.sleep(2000);
			    
			    driver.findElement(By.id("p")).sendKeys("mrunal@2000");
		        Thread.sleep(2000);
		         
		         driver.findElement(By.id("l")).click();
		         Thread.sleep(5000);
		        
		         JavascriptExecutor js1 = ((JavascriptExecutor) driver);
		         js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		         Thread.sleep(5000);
		       driver.get("file:///D:/projeect/product.html");
		       Thread.sleep(5000);
		       driver.get("file:///D:/projeect/index.html");
		       JavascriptExecutor js2 = ((JavascriptExecutor) driver);
		         js2.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		         Thread.sleep(5000);
		       driver.get("file:///D:/projeect/iphone.html");
		       Thread.sleep(5000);
		       driver.quit(); 
	    Thread.sleep(5000);
	 
		System.out.println("Test Case Passed Successfully");
		

		//Fail test case
		       System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Documents\\chromedriver.exe");
	    		
	    		driver = new ChromeDriver();
	  
	    		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);

	    		driver.get("file:///D:/projeect/index.html");
	    			//Max
	    		driver.manage().window().maximize();
	    		Thread.sleep(1000);
	    		
		         
		    driver.get("file:///D:/projeect/login.html");
			   Thread.sleep(2000);
			   driver.findElement(By.id("un")).sendKeys("123");
			    Thread.sleep(2000);
			   driver.findElement(By.id("email")).sendKeys("mrunalpmilawane2000@gmail.com");
			    Thread.sleep(2000);
			    
			    driver.findElement(By.id("p")).sendKeys("mrunal@2000");
		        Thread.sleep(2000);
		         
		         driver.findElement(By.id("l")).click();
		         Thread.sleep(5000);
		        
		         
		       driver.quit();
		       System.out.println("Test case Failed");
	 }

	 public static void main(String[] args) throws InterruptedException {
	  // TODO Auto-generated method stub
	  new MyClass();
	 }
}