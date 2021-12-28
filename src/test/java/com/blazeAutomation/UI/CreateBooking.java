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
	
	@Test(description = "Verify API response when valid CITY Name: Taglag is given")
	public void verifyStatusCode_withValidCityName() {
		try {
			given().get(
					"https://api.openweathermap.org/data/2.5/weather?q=Taglag&appid=841c3b2b6a91dda82ef4bceb4f200901")
					.then().statusCode(200);
			Assert.assertTrue(true, "Status code response for the API is 200");
			System.out.println("----Verify status Code CITY Name: when valid CITY name is passed----");
		} catch (Exception e) {
			System.out.println("erorr occurred-----------------------" + e);
		}
	}

	@Test(description = "Verify API response when Invalid CITY Name: Tagla is given")
	public void verifyStatusCode_withInValidCityName() {
		try {
			Response response = get(
					"https://api.openweathermap.org/data/2.5/weather?q=Tagla&appid=841c3b2b6a91dda82ef4bceb4f200901");

			System.out.println(response.asString());
			System.out.println(response.getBody());
			System.out.println(response.getStatusCode());

			int statusCode = response.getStatusCode();
			Assert.assertEquals(statusCode, 404);
			System.out.println("----Verify status Code CITY Name: when INVALID CITY name is passed----");
		} catch (Exception e) {
			System.out.println("API respose status code is not 404" + e);
		}
	}

}
