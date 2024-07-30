package com.low.level.design.lld.solid.sop.solution;

public class InvoicePrint {
    private InvoiceCalculator invoiceCalculator;
    public InvoicePrint(InvoiceCalculator invoiceCalculator){
        this.invoiceCalculator=invoiceCalculator;
    }
    public void print(){
        invoiceCalculator.calculateTotal();
    }
}
