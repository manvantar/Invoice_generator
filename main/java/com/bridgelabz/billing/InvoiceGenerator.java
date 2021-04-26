package com.bridgelabz.billing;

public class InvoiceGenerator {
    public int COST_PER_TIME=1;
    public double COST_PER_KILOMETER=10;
    public double minimum_fare=5.0;

    /*This method used to calculate Fare
    @param distance,time
    @return miminum_fare when fare calculated is lesser than minimum fare else return calculated fare
    */
    public double calculateFare(double distance, int time) {
        double fare= ((distance*COST_PER_KILOMETER)+time*COST_PER_TIME);
        if(fare>minimum_fare)
            return fare;
        else
            return minimum_fare;

    }
}