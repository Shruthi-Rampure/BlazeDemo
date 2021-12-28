package com.blaze.POM;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class PurchaseFlights extends BasePage{
	


	public PurchaseFlights(WebDriver Idriver,WebDriverWait wait) {
		super(Idriver, wait);
		// TODO Auto-generated constructor stub
	}

	WebDriver d;

	//HomePage homepage1;
	
	
	@FindBy(xpath="//*[text()='United Airlines']/..//input")
	private WebElement chooseFligth;
	
	@FindBy(xpath="//*[text()='Your flight from TLV to SFO has been reserved.']")
	private WebElement purchaseFlightHeader;
	
	@FindBy(id="inputName")
	private WebElement firstName;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(id="city")
	private WebElement city;
	
	@FindBy(id="state")
	private WebElement state;
	
	@FindBy(id="zipCode")
	private WebElement zipCode;
	
	@FindBy(id="creditCardNumber")
	private WebElement creditCardNumber;
	
	@FindBy(id="creditCardYear")
	private WebElement creditCardYear;
	
	@FindBy(id="nameOnCard")
	private WebElement nameOnCard;
	
	@FindBy(xpath="//*[@value='Purchase Flight']")
	private WebElement purchaseFlight;
	
	
	public void purchaseFlight() {
		try{
		// TODO Auto-generated method stub
		Thread.sleep(3000);
		String username = "Shruthi" + new Random().nextInt(10000);
		firstName.sendKeys(username);
		enterText(address,"HAL");
		enterText(city, "Bangalore");
		enterText(state, "Karnataka");
		enterText(zipCode, "457889");
		enterText(creditCardNumber, "7687987987889");
		enterText(creditCardYear,"2021/01/01");
		enterText(nameOnCard, "Shruthi");
		clickOn(purchaseFlight);
		}
		catch(Exception e ){
		Assert.fail("Step failed on choosing flights", e);
		e.getStackTrace();
		}
	}
	



}
