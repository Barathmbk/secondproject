package com.Runnerclass;

import org.testng.annotations.Test;

import com.Baseclass.Baseclass;

import junit.framework.Assert;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest001 extends Baseclass {
//5
  @Test
  public void PersonDetails() {

		driver.findElement(By.id("input-firstname")).sendKeys("Barath");
		
		driver.findElement(By.id("input-lastname")).sendKeys("Kumar");
		driver.findElement(By.id("input-email")).sendKeys("BarathKumar@gmail.com");
  }
  //4
  @BeforeMethod
  public void startpagescreenshot() {
	  screenshot("BeforeMethod");
	  
  }
//6
  @AfterMethod
  public void afterMethod() {
	  screenshot("AfterMethod");
  }
//3
  @BeforeClass
  public void validatePage() {
	  String actual = driver.getCurrentUrl();
	  //String expected = "https://tutorialsninja.com/demo/index.php?route=account/register";
	String expected = "ninja";

	  Assert.assertEquals(actual, expected);
  }
//7
  @AfterClass
  public void getaTitle() {
	  String title = driver.getTitle();
	  System.out.println(title);
	  
  }
//2
  @BeforeTest
  public void beforeTest() {
	  driver.manage().deleteAllCookies();
  }
//8
  @AfterTest
  public void afterTest() {
	  driver.manage().deleteAllCookies();
  }
//1
  @BeforeSuite
  public void launch() {
	  getDriver("chrome");
	  launchUrl("https://tutorialsninja.com/demo/index.php?route=account/register");

  }
//9
  @AfterSuite
  public void afterSuite() {
	  exit();
  }

}
