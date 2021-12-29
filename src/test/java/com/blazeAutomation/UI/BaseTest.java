package com.blazeAutomation.UI;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseTest {
	
	public WebDriver d;
	public WebDriverWait wait;
	//private ReadPropertyFile conf;
	protected String url;
	
	@BeforeClass
	public void launchApplication() throws InterruptedException{
		try{
		startDriver();
		launchApp();
		Assert.assertTrue(true, "Application launch succesfully");
		}
		catch(Exception e ){
			System.out.println("erorr occurred-----------------------" + e);
			e.getStackTrace();	
		}
	}
	

	@AfterClass
	public void closeDriver() throws InterruptedException{
	closeChrome();
	}

public void launchApp()
{
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shruthi Rampure\\workspace\\BlazeDemo\\BrowserSpecificDriver\\chromedriver.exe");
	//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "//BrowserSpecificDriver//chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-extensions");
	options.addArguments("--headless");
	options.addArguments("--no-sandbox");
	options.addArguments("--disable-dev-shm-usage");
	d=new ChromeDriver(options);
	wait = new WebDriverWait(d,15);
	d.get("https://blazedemo.com/");
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
}

private void startDriver() {
        WebDriverManager.chromedriver().setup();  
}

public void closeChrome() throws InterruptedException
{
	Thread.sleep(1000);
	d.close();
}
}
