package com.blz.CabInvoiceGenerator;

public class InvoiceSummary {
	
	public double totalFare;
    public int length;
    public InvoiceSummary(double totalFare, int length) {
        this.totalFare = totalFare;
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceSummary that = (InvoiceSummary) o;
        return Double.compare(that.totalFare, totalFare) == 0 && length == that.length;
    }

}
