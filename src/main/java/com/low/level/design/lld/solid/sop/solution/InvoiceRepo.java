package com.low.level.design.lld.solid.sop.solution;

public class InvoiceRepo {
    private InvoiceCalculator invoiceCalculator;

    public InvoiceRepo(InvoiceCalculator invoiceCalculator) {
        this.invoiceCalculator = invoiceCalculator;
    }

    public void saveToDB(){
        invoiceCalculator.calculateTotal();
    }
}
