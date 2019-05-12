package com.singleton.qa.testcase;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.singleton.qa.TestBase;

public class SingleFreeCRM {
	
	@BeforeClass
	public void setUp() {
		TestBase.initialize();
	}
	
	@Test
	public void freecrmtitletest() {
		String title = TestBase.driver.getTitle();
		Assert.assertEquals(title, "CRMPRO - CRM software for customer relationship management, sales, and support.", "Not Matching");
	}
	
	@Test
	public void freecrmlogotest() {
	     Boolean b = TestBase.driver.findElement(By.className("img-responsive")).isDisplayed();
	     Assert.assertTrue(b);
	}
	
	@AfterClass
	public void tearDown() {
		TestBase.quit();
	}

}
