package com.blaze.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class WelcomePage extends BasePage{
	


	public WelcomePage(WebDriver Idriver,WebDriverWait wait) {
		super(Idriver, wait);
		// TODO Auto-generated constructor stub
	}

	WebDriver d;

	//HomePage homepage1;
	

	
	@FindBy(xpath="//h1[text()='Welcome to the Simple Travel Agency!']")
	private WebElement homepage;
	
	@FindBy(xpath="//*[@name='fromPort']")
	private WebElement departure;
	
	@FindBy(xpath="//*[@name='toPort']")
	private WebElement destination;
	
	@FindBy(xpath="//*[@value='Find Flights']")
	private WebElement findFlights;
	
	@FindBy(xpath="//*[text()='Flights from Boston to Rome: ']")
	private WebElement findListHeader;
	
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
	
	@FindBy(xpath="//[@value='Purchase Flight']")
	private WebElement purchaseFlight;
	
	@FindBy(xpath="//*[text()='Your flight from TLV to SFO has been reserved.']")
	private WebElement thankyouHeader;
	
	@FindBy(xpath="confirmationID")
	private WebElement confirmationID;
	
	public void openApplication() {
		try{
		// TODO Auto-generated method stub
		Thread.sleep(3000);
		homepage.isDisplayed();
		Assert.assertTrue(true, "Welcome page is displayed succesfully");
		}
		catch(Exception e ){
			System.out.println("erorr occurred-----------------------" + e);
		}
	}
	
	public void selectDestination() {
		try{
		// TODO Auto-generated method stub
		Thread.sleep(3000);
		selectByVisibletext(departure, "Boston");
		Thread.sleep(2000);
		selectByVisibletext(destination, "Rome");
		clickOn(findFlights);
		Thread.sleep(2000);
		verifyHeader(findListHeader);
		Assert.assertTrue(true, "Choose departure and destination succesfully");
		}
		catch(Exception e ){
			System.out.println("erorr occurred-----------------------" + e);
		e.getStackTrace();
		}
	}
	
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
	
	/*public void purchaseFlight() {
		try{
		// TODO Auto-generated method stub
		Thread.sleep(3000);
		enterText(firstName);
		enterText(address);
		enterText(city);
		enterText(state);
		enterText(zipCode);
		enterText(creditCardNumber);
		enterText(creditCardYear);
		enterText(nameOnCard);
		clickOn(purchaseFlight);
		}
		catch(Exception e ){
		Assert.fail("Step failed on choosing flights", e);
		e.getStackTrace();
		}
	}*/
	
	public void confirmationPage() {
		try{
		// TODO Auto-generated method stub
		Thread.sleep(2000);
		verifyHeader(thankyouHeader);
		String confirmID= confirmationID.getText();
		Thread.sleep(2000);
		Assert.assertTrue(true, "Flight booking confirmed, Confirmation ID is"+confirmID);
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


	
	/*public boolean isUserLoggedIn() {
		
	//logger.info("if user login is succesfull...");
		homepage.isDisplayed();
		return false;
	}*/

}
