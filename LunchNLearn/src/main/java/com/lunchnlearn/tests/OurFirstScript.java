package com.lunchnlearn.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OurFirstScript {

	/*
	 * This test asserts that the search results are for selenium
	 */
   @Test
	public void firstScript(){
	
    ChromeDriver driver = new ChromeDriver();
    driver.get("https://www.google.com");
    driver.findElement(By.id("lst-ib")).sendKeys("Selenium");
    driver.findElement(By.className("sbico-c")).click();
    boolean count = false;
    //Count how any times the page says selenium. If > 100 set count equal to true
    
    
    
    Assert.assertTrue(count);
  }
}
