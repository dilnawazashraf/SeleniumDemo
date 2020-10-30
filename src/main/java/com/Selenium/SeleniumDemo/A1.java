package com.Selenium.SeleniumDemo;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import java.lang.Thread;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class A1 {
	@org.testng.annotations.Test
	public void testcase1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.impetus.com");
		driver.manage().window().maximize();
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		driver.findElement(By.xpath("//*[@id=\"block-block-1\"]/div/div/div/div[3]/ul/li[2]/a")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		Select dropdown=new Select(driver.findElement(By.id("edit-field-job-location-value")));
		dropdown.selectByVisibleText("Texas");
		driver.findElement(By.id("edit-submit-openings")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		String text=driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[2]/div[1]/div/div/div[2]/div/div[2]/div[1]/div/div/div/div[2]/div/div/div[1]/div/div[1]")).getText();
		String expected="PreSales Solution Architect";
		assertEquals(expected, text);
		System.out.println(text);
		System.out.println(expected);
		System.out.println((expected.equals(text)));
		driver.close();
	}
	
}
