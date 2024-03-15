package org.springboot.Selenium.flights;

import org.springboot.Selenium.google.SpringTestNgTest;
import org.springboot.Selenium.pages.flights.FlightsPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.TestPropertySource;
import org.testng.Assert;
import org.testng.annotations.Test;
//@TestPropertySource(properties = "app.locale=flight_sp")
@TestPropertySource(properties = "browser=firefox")
public class FlightTest extends SpringTestNgTest {
    @Autowired
    private FlightsPage flightsPage;
    @Autowired
    private FlightAppDetails appDetails;
    @Test
    public void flightTest(){
        flightsPage.navigateTo(appDetails.getUrl());
        Assert.assertTrue(flightsPage.isLoaded());
        System.out.println(flightsPage.getMenuElementsLabel());
        Assert.assertEquals(flightsPage.getMenuElementsLabel(),appDetails.getLabels());
    }
}
