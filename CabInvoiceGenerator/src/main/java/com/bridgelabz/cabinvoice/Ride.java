package com.bridgelabz.cabinvoice;

public class Ride {

    public final int time;
    public final double distance;
    public final InvoiceServices.RideMode rideMode;

    public Ride(double distance, int time, InvoiceServices.RideMode rideMode) {
        this.distance = distance;
        this.time = time;
        this.rideMode = rideMode;
    }
}
