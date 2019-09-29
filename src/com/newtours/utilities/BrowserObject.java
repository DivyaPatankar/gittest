package com.newtours.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserObject {
	
	static WebDriver driver;
	public static WebDriver get(String browserName) throws Exception {
	
	if(browserName.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32 (3)\\chromedriver.exe");
		 driver = new ChromeDriver();		
	}else if(browserName.equals("ie")) {
		System.setProperty("webdriver.ie.driver", "G:\\chromedriver_win32 (3)\\internetExplorerdriver.exe");
		driver = new InternetExplorerDriver();		
	}else if(browserName.equals("firefox")) {
		System.setProperty("webdriver.gecho.driver", "G:\\chromedriver_win32 (3)\\gechodriver.exe");
		 driver = new FirefoxDriver();
	}else {
		throw new Exception("Invalid browser name" + browserName);
	}
	return driver;
}
}
