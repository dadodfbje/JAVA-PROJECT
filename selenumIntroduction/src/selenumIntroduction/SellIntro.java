package selenumIntroduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import dev.failsafe.internal.util.Assert;

public class SellIntro {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Selenium Manager on
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kumar\\Downloads\\chromedriver_win32\\chromeDriver.exe");
		WebDriver fis = new ChromeDriver();
		//WebDriver excer=new FirefoxDriver();
		// ChromeDriver excer=new ChromeDriver();
		fis.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		fis.get("https://rahulshettyacademy.com/locatorspractice/");
		// fis.close();
		System.out.println(fis.getTitle());
		System.out.println(fis.getCurrentUrl());
		fis.findElement(By.id("inputUsername")).sendKeys("Kazaria");
		fis.findElement(By.name("inputPassword")).sendKeys("123456");
		fis.findElement(By.id("chkboxOne")).click();
		fis.findElement(By.id("chkboxTwo")).click();
		fis.findElement(By.className("submit")).click();
		System.out.println(fis.findElement(By.cssSelector("p.error")).getText());
		fis.findElement(By.linkText("Forgot your password?")).click();
		 Thread.sleep(1000);//In stable
		fis.findElement(By.xpath("//input[@type='text'][1]")).sendKeys("Katariya");
		fis.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("Katariya123@gmail.com");
		fis.findElement(By.xpath("//form/input[3]")).sendKeys("789456123");
		// fis.findElement(By.xpath("//button[@className='reset-pwd-btn']")).sendKeys("789456123");
		fis.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(fis.findElement(By.cssSelector("form p")).getText());
		fis.findElement(By.cssSelector(".go-to-login-btn")).click();
		//fis.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		 Thread.sleep(2000);
		fis.findElement(By.id("inputUsername")).sendKeys("Katariya");
		fis.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
        Thread.sleep(1000);
		fis.findElement(By.className("signInBtn")).click();
		//Assert.assertEquals(fis.findElement(By. tagName("p")).getText(),"You are successfully logged in.");
	
	
		
         
		// fis.close();
		 //fis.quit();

	}

}
