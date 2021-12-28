package com.blaze.POM;


import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;




public class BasePage {
	public WebDriver d;
	public WebDriverWait wait;

	

	
	protected BasePage(WebDriver Idriver,WebDriverWait wait)
	{
		this.d=Idriver;
		this.wait =wait;
		PageFactory.initElements( d, this);
	}
	
	
	public void clickOn(WebElement selObj) throws InterruptedException{
	try{
	Thread.sleep(3000);
	if(selObj.isDisplayed()){
		Thread.sleep(4000);
		selObj.click();
		Assert.assertTrue(true, "Element click succesfully"+selObj);
		}else{
		Assert.fail("Element click Failed "+selObj);
		}
	}
	catch(WebDriverException e){
		Assert.fail("Error Occured ", e);	
	}
	}
	
	public void selectByVisibletext(WebElement selObj, String selString) throws InterruptedException{
	try{
	Thread.sleep(3000);
	Select sel = new Select(selObj);
	sel.selectByVisibleText(selString);
	Assert.assertTrue(true, "Drop down selected succesfully"+selString);
	}
	catch(WebDriverException e){
		Assert.fail("Application launch failed", e);
	}
	}
	
	public void verifyHeader(WebElement selObj) throws InterruptedException{
	try{
	Thread.sleep(3000);
	if(selObj.isDisplayed()){
		Assert.assertTrue(true, "Header present "+selObj);
		}else{
		Assert.fail("Header NOT present "+selObj);
		}
	}
	catch(WebDriverException e){
		Assert.fail("Header NOT present", e);
	}
	}
	
	public void enterText(WebElement selObj, String txt) throws InterruptedException{
	try{
	Thread.sleep(2000);
		//String username = "Shruthi" + new Random().nextInt(10000);
		selObj.sendKeys(txt);

	}
	catch(WebDriverException e){
		Assert.fail("Header NOT present", e);
	}
	}
	
}
