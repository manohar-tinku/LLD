package com.low.level.design.lld.solid.ocp.violate;

//violates open for extension and closed for modification
public class InvoiceDao {
    private int invoicePrince;

    public InvoiceDao(int invoicePrince) {
        this.invoicePrince = invoicePrince;
    }
    //existing functionality - saving to DB
    public void saveToDB(){
        //save to db
        System.out.println(invoicePrince);
    }

    //future functionality - save to file (according to principle we should not modify the existing class)
    //why? this class is tested, and was in live. If we do any change need to test again
    public void saveToFile(){
        //save to file
    }
}
