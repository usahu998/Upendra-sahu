package com.bridgelabz.cabinvoice;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InvoiceServiceTest {

    InvoiceServices invoiceService = null;

    @Before
    public void getInstance_Of_InvoiceGenerator() {
        invoiceService = new InvoiceServices();
    }

    @Test
    public void givenDistanceAndTime_shouldReturnTotalFare() {
        double distance = 2.0;
        int time = 5;
        double fare = invoiceService.calculateFareForNormal(distance, time);
        Assert.assertEquals(25, fare, 0.0);
    }

    @Test
    public void givenLessDistanceAndTime_shouldReturnMinFare() {
        double distance = 0.1;
        int time = 1;
        double fare = invoiceService.calculateFareForNormal(distance, time);
        Assert.assertEquals(5, fare, 0.0);
    }


    @Test
    public void givenMultipleRide_ShouldReturnTotalFare() {
        Ride[] rides = {new Ride(2.0, 5, InvoiceServices.RideMode.NORMAL),
                new Ride(0.1, 1,InvoiceServices.RideMode.NORMAL),
        };
        InvoiceSummary summary = invoiceService.calculateFareForNormal(rides);
        InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(2, 30.0);
        Assert.assertEquals(expectedInvoiceSummary, summary);
    }

    @Test
    public void givenUserIdAndRides_ShouldReturnInvoiceSummary() {
        String userId = "a@b.com";
        Ride[] rides = {new Ride(2.0, 5,InvoiceServices.RideMode.NORMAL),
                new Ride(0.1, 1,InvoiceServices.RideMode.NORMAL),
        };
        invoiceService.addRides(userId, rides);
        Ride[] rides1 = {new Ride(2.0, 5,InvoiceServices.RideMode.NORMAL),
                new Ride(0.1, 1,InvoiceServices.RideMode.NORMAL),
        };
        invoiceService.addRides(userId, rides1);
        InvoiceSummary summary = invoiceService.getInvoiceSummary(userId);
        InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(2, 30.0);
        Assert.assertEquals(expectedInvoiceSummary, summary);
    }

    @Test
    public void givenDistanceAndTime_shouldReturnPremiumTotalFare() {
        double distance = 2.0;
        int time = 5;
        double fare = invoiceService.calculateFareForPremium(distance, time);
        Assert.assertEquals(40, fare, 0.0);
    }

    @Test
    public void givenMultipleRide_ShouldReturnPremiumTotalFare() {
        Ride[] rides = {new Ride(2.0, 5, InvoiceServices.RideMode.PREMIUM),
                new Ride(0.1, 1,InvoiceServices.RideMode.PREMIUM),
        };
        InvoiceSummary summary = invoiceService.calculateFareForNormal(rides);
        InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(2, 50);
        Assert.assertEquals(expectedInvoiceSummary, summary);
    }

    @Test
    public void givenUserIdAndRides_ShouldReturnBothInvoiceSummary() {
        String userId = "a@b.com";
        Ride[] rides = {new Ride(2.0, 5,InvoiceServices.RideMode.NORMAL),
                new Ride(0.1, 1,InvoiceServices.RideMode.NORMAL),
        };
        invoiceService.addRides(userId, rides);
        Ride[] rides1 = {new Ride(2.0, 5,InvoiceServices.RideMode.p),
                new Ride(0.1, 1,InvoiceServices.RideMode.NORMAL),
        };
        invoiceService.addRides(userId, rides1);
        InvoiceSummary summary = invoiceService.getInvoiceSummary(userId);
        InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(2, 30.0);
        Assert.assertEquals(expectedInvoiceSummary, summary);
    }
}


