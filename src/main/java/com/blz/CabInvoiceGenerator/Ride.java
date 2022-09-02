package com.blz.CabInvoiceGenerator;

public class Ride {
	
	private double distance = 0.0;
    private double time = 0.0;

    public Ride(double v, int i) {
        this.distance = v;
        this.time = i;
    }

    public double getDistance() {
        return distance;
    }

    public double getTime() {
        return time;
    }

}
