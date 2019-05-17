package com.qa.tests;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tests {
	WebDriver driver;
	
	@Before 
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:\\www.google.com");
	}
	@Test
	public void test1()
	{
        WebElement we = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input"));
        we.sendKeys("kittens");
        we.submit(); 
        WebElement checkElement = driver.findElement(By.xpath("//*[@id=\"rhs_block\"]/div/div[1]/div/div[1]/div[2]/div[1]/div[2]/div[2]/div/div/div[2]/div[1]/span"));
        assertEquals("Kitten",checkElement.getText());
	}
	
	@After
	public void tearDown()
	{
		driver.quit(); 
	}
	
}
