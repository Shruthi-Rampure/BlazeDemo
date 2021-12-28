package com.blaze.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class ConfirmationPage extends BasePage{
	


	protected ConfirmationPage(WebDriver Idriver,WebDriverWait wait) {
		super(Idriver, wait);
		// TODO Auto-generated constructor stub
	}

	WebDriver d;

	//HomePage homepage1;
	
	
	@FindBy(xpath="//*[text()='Your flight from TLV to SFO has been reserved.']")
	private WebElement thankyouHeader;
	
	@FindBy(xpath="confirmationID")
	private WebElement confirmationID;
	//*[text()='Id']//following-sibling::td

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
}
