package com.low.level.design.lld.solid.sop.violate;

public class Invoice {
    private Marker marker;
    private int quantity;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    //first reason -> if in case there is a requirement to add gst or discount
    public int calculateTotal(){
        return (marker.getPrice()*quantity);
    }

    //second reason -> can change to send an email or message
    public void printInvoice(){
        //display to console
    }

    //third reason -> can change to
    public void saveInvoice(){
        //store to db
    }
}
