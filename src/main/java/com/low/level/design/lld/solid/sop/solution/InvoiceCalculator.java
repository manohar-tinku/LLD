package com.low.level.design.lld.solid.sop.solution;

public class InvoiceCalculator {
    private Marker marker;
    private int quantity;

    public InvoiceCalculator(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    public int calculateTotal(){
        return marker.getPrice()*quantity;
    }
}
