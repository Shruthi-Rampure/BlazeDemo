package com.blaze.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ChooseFlights extends BasePage{
	

	public ChooseFlights(WebDriver Idriver,WebDriverWait wait) {
		super(Idriver, wait);
		// TODO Auto-generated constructor stub
	}

	WebDriver d;

	//HomePage homepage1;
	
	@FindBy(xpath="//*[text()='United Airlines']//..//input")
	private WebElement chooseFligth;
	
	@FindBy(xpath="//*[text()='Your flight from TLV to SFO has been reserved.']")
	private WebElement purchaseFlightHeader;
	
	
	public void chooseFlight() {
		try{
		// TODO Auto-generated method stub
		Thread.sleep(3000);
		clickOn(chooseFligth);
		Assert.assertTrue(true, "Choose flight successfully");
		verifyHeader(purchaseFlightHeader);
		Assert.assertTrue(true, "Succesfully navigated to purhase flight page");
		}
		catch(Exception e ){
			System.out.println("erorr occurred-----------------------" + e);
		e.getStackTrace();
		}
	}
	/*public void selectByVisibletext(WebElement selObj, String selString) throws InterruptedException{
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
	
	public void clickOn(WebElement selObj) throws InterruptedException{
	try{
	Thread.sleep(2000);
	wait.until(ExpectedConditions.elementToBeClickable(selObj));
	selObj.click();
	
	Assert.assertTrue(true, "Element click succesfully"+selObj);
	}
	catch(WebDriverException e){
		Assert.fail("Element click failed"+selObj, e);	
	}
	}*/

	public void closeChrome() throws InterruptedException
	{
		Thread.sleep(3000);
		d.close();
	}


}
