package com.Selenium.SeleniumDemo;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.lang.Thread;
import java.util.concurrent.TimeUnit;
public class A3 {
	@org.testng.annotations.Test
	public void testcase3() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.in");
		Thread.sleep(1000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-text\"]/input")).click();
		Select dropdown=new Select(driver.findElement(By.id("s-result-sort-select")));
		dropdown.selectByIndex(2);
		String text=driver.findElement(By.xpath("/html/body/div[1]/div[2]/span/div/span/h1/div/div[1]/div/div")).getText();
		String expected="1-16 of 100 results for \"Mobile\"";
		Thread.sleep(5000);
		System.out.println(text);
		System.out.println(expected);
		System.out.println(expected.equals(text));
		driver.close();
		
	}
}