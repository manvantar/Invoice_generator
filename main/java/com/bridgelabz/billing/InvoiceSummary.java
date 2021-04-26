package com.bridgelabz.billing;

import java.util.Objects;

public class InvoiceSummary {
    int numberOfRide;
    double totalFare;
    double averageFare;

    public InvoiceSummary(int numberOfRide,double totalFare){
        this.numberOfRide=numberOfRide;
        this.totalFare=totalFare;
        this.averageFare=this.totalFare/this.numberOfRide;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceSummary that = (InvoiceSummary) o;
        return numberOfRide == that.numberOfRide && Double.compare(that.totalFare, totalFare) == 0 && Double.compare(that.averageFare, averageFare) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfRide, totalFare, averageFare);
    }

}
