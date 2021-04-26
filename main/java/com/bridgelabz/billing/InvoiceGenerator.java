package com.bridgelabz.billing;

public class InvoiceGenerator {
    public int COST_PER_TIME=1;
    public double COST_PER_KILOMETER=10;
    public double minimum_fare=5.0;
    public double premiumMinimumFarePerKM =15.0;
    public int premiumCostPerMinute = 2;
    public double premiumMinimumFare = 20.0;

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

     /*This method used to calculate Invoice Summary for mutiple rides, which inturn calls the method calculateFare
    to calculate the fare
    @param array[] of ride
    @return summary of ride of type InvoiceSummary
    */

    public InvoiceSummary calculateRideFare(Ride[] ride) {
        Double totalfare=0.0;
        for (Ride rides: ride) {
            totalfare+=calculateFare(rides.distance,rides.time);
        }
        return new InvoiceSummary(ride.length, totalfare);
    }

    /*This method used to calculate Premium fare
    @param dist=distance travelled, time in minutes
    @return premium_minimum_fare value if Totalfare is lesser than premium_minimum_fare_value
    else return total calculated fare*/

    public double calculatePremiumFare(double dist, int time) {
        double totalFare =  dist * premiumMinimumFarePerKM + time * premiumCostPerMinute;
        if(totalFare < premiumMinimumFare ) {
            return  premiumMinimumFare;
        }
        return totalFare;
    }

}
