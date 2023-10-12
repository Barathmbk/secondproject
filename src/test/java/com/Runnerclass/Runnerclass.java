package com.Runnerclass;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Baseclass.Baseclass;


public class Runnerclass extends Baseclass{
	@Test (priority = 1)
	private void validateTheHomePage() {
		getDriver("chrome");
		//To create the user in website /- need to use below link//
		//launchUrl("https://tutorialsninja.com/demo/index.php?route=account/register");
		//**To sign up the website ***/-- need to use below link for sign up//
		launchUrl("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		
	}
	@Test(priority =2)
	private void signup() {
		driver.findElement(By.id("input-email")).sendKeys("barathkumar@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Barath123");

		
		
	}
	@Test  (priority = 2 ,enabled = false)
	private void register() {
		driver.findElement(By.id("input-firstname")).sendKeys("barath");
		driver.findElement(By.id("input-lastname")).sendKeys("Kumar");
		driver.findElement(By.id("input-email")).sendKeys("barathkumar@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("9876543210");

	}
		@Test (priority = 3, enabled = false)
		private void password() {
			driver.findElement(By.id("input-password")).sendKeys("Barath123");
			driver.findElement(By.id("input-confirm")).sendKeys("Barath123");


		}
		
		
		@Test  (priority = 4,enabled = false)
		private void termsAndCondition() {
			driver.findElement(By.xpath("//input[@type='checkbox']")).click();
			
		}

		@Test  (priority = 3)
		private void proceed() {
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			
		}
	
}

