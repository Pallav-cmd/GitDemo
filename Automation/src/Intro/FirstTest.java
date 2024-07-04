package Intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Suji\\chromedriver.exe");
		//WebDriver driver;
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		driver.close();

	}

}
