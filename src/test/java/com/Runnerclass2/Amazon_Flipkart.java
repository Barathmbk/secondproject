package com.Runnerclass2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.Baseclass.Baseclass;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Amazon_Flipkart extends Baseclass {
  @Test
  public void AmazonPage() {
	  
	  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
	  driver.findElement(By.id("nav-search-submit-button")).click();
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
	  String actual = driver.getCurrentUrl();
	  String expected = "https://www.amazon.in/";
	  AssertJUnit.assertEquals(actual, expected);
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
	  launchUrl("https://www.amazon.in/");
  }

  @AfterSuite
  public void afterSuite() {
	  exit();
  }

}
