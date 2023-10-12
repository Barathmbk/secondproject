package com.Runnerclass2;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Baseclass.Baseclass;

import junit.framework.Assert;

public class Flipkart extends Baseclass{
	@Test
	  public void Flipkart() {
		  
		  driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("iphone");
		  driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	  }
	  @BeforeMethod
	  public void beforeMethod() {
			  screenshot("BeforeMethod");
	  }

	  @AfterMethod
	  public void afterMethod() {
		  screenshot("AfterMethod");
	  }

	  @BeforeClass
	  public void beforeClass() {
		  String current = driver.getCurrentUrl();
		  String expected = "https://www.flipkart.com/search";
		  Assert.assertEquals(current, expected);
	  }

	  @AfterClass
	  public void getatitle() {
		  String title = driver.getTitle();
		  System.out.println(title);  
	  }

	  @BeforeTest
	  public void beforeTest() {
		  driver.manage().deleteAllCookies();
	  }

	  @AfterTest
	  public void afterTest() {
		  driver.manage().deleteAllCookies();
	  }

	  @BeforeSuite
	  public void beforeSuite() {
		  getDriver("chrome");
		  launchUrl("https://www.flipkart.com/search");
	  }

	  @AfterSuite
	  public void afterSuite() {
		  exit();
	  }

	}
