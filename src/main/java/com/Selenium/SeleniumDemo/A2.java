package com.Selenium.SeleniumDemo;

//import org.junit.Test;
//import org.junit.experimental.theories.suppliers.TestedOn;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.lang.Thread;

public class A2 {
	@org.testng.annotations.Test
	public void te11() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://empower.impetus.co.in");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.name("UserName")).sendKeys("");
		driver.findElement(By.name("Password")).sendKeys("");
		driver.findElement(By.id("submitButton")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"__item0-anchorNavigationBar-2\"]/div")).click();
		driver.findElement(By.id("__tile7")).click();
		Thread.sleep(5000);
		String text=driver.findElement(By.id("__number0-__clone2")).getText();
		System.out.println(text);
		String expected="2 Days";
		System.out.println("Verify casual leaves: "+expected.equals(text));
		driver.close();
	}	
}
