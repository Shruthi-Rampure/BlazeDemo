package com.blazeAutomation.UI;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.blaze.POM.ChooseFlights;
import com.blaze.POM.PurchaseFlights;
import com.blaze.POM.WelcomePage;

import io.restassured.response.Response;

public class CreateBooking extends BaseTest {

	@Test(description = "Test to Purchase Flight")
	public void VerifyLoginPage() {
		try {
			WelcomePage welcomepage = new WelcomePage(d, wait);
			ChooseFlights chooseflights = new ChooseFlights(d, wait);
			PurchaseFlights purchaseflights = new PurchaseFlights(d, wait);
			// Select Departure and Destination flights
			welcomepage.selectDestination();
			// Choose Flights and Proceed
			chooseflights.chooseFlight();
			Thread.sleep(2000);
			// Purchase Flight
			purchaseflights.purchaseFlight();
			// Booking Confirmation Page
		} catch (Exception e) {
			System.out.println("erorrrr-----------------------" + e);
		}
	}
	

}
