package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureErrorMessage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Suji\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//Implicit wait applicable for all steps globally for finding elements
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("suji");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshetty");
		driver.findElement(By.className("signInBtn")).click();
		
		// To capture Error message
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		//Forgot password
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
		//driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("john@gmail.com");
		
		//To clear where attribute is present multiple times with same value
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john12@mail.com");
		
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9876543210");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		
		//grab message
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		Thread.sleep(1000);
		
		//Signin with checkboxes
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("John");
		
		//regular expresssion for dynamic values of type
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		//driver.close();
		driver.quit();

	}

}
