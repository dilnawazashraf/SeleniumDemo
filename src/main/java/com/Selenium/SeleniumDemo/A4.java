package com.Selenium.SeleniumDemo;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import java.lang.Thread;

public class A4 {
	@org.testng.annotations.Test
	public void testcase4() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.impetus.com");
		String title=driver.getTitle();
		driver.manage().window().maximize();
		String expected="Impetus - Enabling a unified view of your business on cloud";
		System.out.println("Verified Title: "+expected.equals(title));
		Actions action=new Actions(driver);
		WebElement dropdown = driver.findElement(By.linkText("ETL, EDW and Analytics Conversion to Cloud"));
		action.moveToElement(dropdown).build().perform();
		WebElement azure = driver.findElement(By.linkText("Transform to Azure"));
		action.moveToElement(azure).click().perform();
		Thread.sleep(2000);
		String text=driver.findElement(By.xpath("//*[@id=\"teradata1\"]/div/div[2]/div/div[4]/div/div[2]/h4")).getText();
		System.out.println(text);
		Thread.sleep(5000);
		System.out.println("Verify Maximum ROI: "+text.contains("maximum ROI"));
		//System.out.println(driver.getPageSource().contains("maximum ROI"));
		driver.close();
	}
}
