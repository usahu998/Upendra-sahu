package com.bridgelabz.cabinvoice;

public class InvoiceSummary {
    private final int numOfRides;
    private final double totalFare;
    private final double average;

    public InvoiceSummary(int numOfRides, double totalFare) {
        this.numOfRides = numOfRides;
        this.totalFare = totalFare;
        this.average = numOfRides / totalFare;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceSummary that = (InvoiceSummary) o;
        return numOfRides == that.numOfRides &&
                Double.compare(that.totalFare, totalFare) == 0 &&
                Double.compare(that.average, average) == 0;
    }

    @Override
    public String toString() {
        return "InvoiceSummary{" +
                "numOfRides=" + numOfRides +
                ", totalFare=" + totalFare +
                ", average=" + average +
                '}';
    }
}
