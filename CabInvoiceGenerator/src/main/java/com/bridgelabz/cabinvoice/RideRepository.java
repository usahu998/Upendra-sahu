package com.bridgelabz.cabinvoice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RideRepository {
    Map<String, ArrayList<Ride>> userRides;

    public RideRepository() {
        this.userRides = new HashMap<>();
    }

    public void addRides(String userId, Ride[] rides) {
        if (userRides.entrySet() == null) {
            this.userRides.put(userId,);
        }
        if (this.userRides.containsKey(userId)) {
            userRides.computeIfPresent(userId,;).add()
        }
    }

    public Ride[] getRides(String userId) {
        return this.userRides.get(userId).toArray(new Ride[0]);
    }
}
