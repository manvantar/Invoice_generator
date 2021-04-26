package com.bridgelabz.billing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TesterBilling {

    @Test
    public void givenDistanceandTime_whenCalculetedFare_shouldReturnFare(){
        InvoiceGenerator invoiceGenerator=new InvoiceGenerator();
        double distance=2.0;
        int time=5;
        double fare=invoiceGenerator.calculateFare(distance,time);
        Assertions.assertEquals(25,fare);
        double fare2=invoiceGenerator.calculateFare(0.3,1);
        Assertions.assertEquals(5.0,fare2);
    }

    @Test
    public void givenMultipleRides_whenCalculatedFareofMultipleRIdes_shouldReturnTotalFare(){
        InvoiceGenerator invoiceGenerator=new InvoiceGenerator();
        Ride[] ride={new Ride(2.0,5),new Ride(0.3,1)};
        Double totalFare=invoiceGenerator.calculateRideFare(ride);
        Assertions.assertEquals(30.0,totalFare);
    }




}
