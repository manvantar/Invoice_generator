package com.bridgelabz.billing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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

  /*  @Test
    public void givenMultipleRides_whenCalculatedFareofMultipleRIdes_shouldReturnTotalFare(){
        InvoiceGenerator invoiceGenerator=new InvoiceGenerator();
        Ride[] ride={new Ride(2.0,5),new Ride(0.3,1)};
        Double totalFare=invoiceGenerator.calculateRideFare(ride);
        Assertions.assertEquals(30.0,totalFare);
    }*/

    @Test
    public void givenMultipleRides_whenCalculated_shouldReturnSummary(){
        InvoiceGenerator invoiceGenerator=new InvoiceGenerator();
        Ride[] ride={new Ride(2.0,5),new Ride(0.3,1)};
        InvoiceSummary actualSummary= invoiceGenerator.calculateRideFare(ride);
        InvoiceSummary expectedinvoiceSummary=new InvoiceSummary(2,30);
        Assertions.assertEquals(actualSummary,expectedinvoiceSummary);
    }

    @Test
    public void givenUserId_shouldReturnInvoice() {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        List<User> usersList = new ArrayList<>();
        Ride ride1 = new Ride(3.4, 5);
        Ride ride2 = new Ride(1.2, 34);
        User user = new User(1, ride1);
        User user2 = new User(2, ride2);
        usersList.add(user);
        usersList.add(user2);
        Iterator<User> iterator = usersList.iterator();
        while (iterator.hasNext()) {
            User tempUser=iterator.next();
            if (tempUser.id == 1) {
                InvoiceSummary actualsummary1 = tempUser.invoiceGenerator;
                InvoiceSummary expectedSummary= new InvoiceSummary(1, 39.0);
                Assertions.assertEquals(actualsummary1,expectedSummary);
            }
        }
    }

    @Test
    public void givenDistanceandTime_whenCalculetedPremiumFare_shouldReturnFare(){
        InvoiceGenerator invoiceGenerator=new InvoiceGenerator();
        double distance=2.0;
        int time=5;
        double fare=invoiceGenerator.calculatePremiumFare(distance,time);
        System.out.println(fare);
        Assertions.assertEquals(40,fare);
        double fare2=invoiceGenerator.calculatePremiumFare(0.3,1);
        Assertions.assertEquals(20,fare2);
    }

}


