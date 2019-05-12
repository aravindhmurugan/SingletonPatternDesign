package com.singleton.qa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public static WebDriver driver = null;
	
	public static void initialize(){
		
		if(driver==null) {
			if(Constants.BrowserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "E:/My Backups/chromedriver.exe");
				driver = new ChromeDriver();
			}else if(Constants.BrowserName.equalsIgnoreCase("FF")) {
				System.setProperty("webdriver.gecko.driver", "E:/My Backups/geckodriver.exe");
				driver = new FirefoxDriver();
			}
		
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Constants.ImplicitlyWait, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(Constants.Pageloadtimeout, TimeUnit.SECONDS);
		driver.get("https://classic.crmpro.com");
		
	}
		
		public static void quit(){
			System.out.println("quitting the browser");
			driver.quit();
			driver = null;
		}
		
		public static void close() {
			System.out.println("closing the browser");
			driver.close();
			driver = null;
		}
	}


