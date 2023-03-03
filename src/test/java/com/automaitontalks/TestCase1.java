package com.automaitontalks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase1 {

	WebDriver driver;

	@BeforeMethod
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();

	}

	@Test
	public void test1() {
		driver.navigate().to("https://automationtalks.com/");
		System.out.println("Test1 Title is: "+driver.getTitle());

	}

	@Test
	public void test2() {
		driver.navigate().to("https://automationtalks.com/");
		System.out.println("Test2 Title is: "+driver.getTitle());

	}

	@Test
	public void test3() {
		driver.navigate().to("https://automationtalks.com/");
		System.out.println("Test3 Title is: "+driver.getTitle());

	}

	@AfterMethod
	public void tearDown() {
		driver.close();
		
	}
}
