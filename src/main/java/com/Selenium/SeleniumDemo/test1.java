package com.Selenium.SeleniumDemo;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test1 {
	WebDriver driver=new ChromeDriver();
	@org.testng.annotations.BeforeClass
	public void initiate() {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		driver.navigate().to("https://www.impetus.com");
	}
	
	@Test
	public void getTitle() {
		System.out.println(driver.getTitle());
	}
}
