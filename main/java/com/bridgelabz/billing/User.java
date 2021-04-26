package com.bridgelabz.billing;

import java.util.ArrayList;
import java.util.List;

public class User {
    int id;
    Ride ride;
    InvoiceSummary invoiceGenerator;
    List<Ride> rides = new ArrayList<>();

    public User(int id, Ride ride) {
        this.id = id;
        this.ride = ride;
        rides.add(ride);
        Ride[] rides = new Ride[]{ride};
        this.invoiceGenerator = new InvoiceGenerator().calculateRideFare(rides);
    }
}