package com.low.level.design.lld.solid.isp.violate;

//violate the interface segregation principle, according to it, client should not implement
//unnecessary functions they do not need
public class Waiter implements RestaurantEmployee{
    @Override
    public void washDishes() {
        //not his work
    }

    @Override
    public void serveCustomer() {
        //need to serve the customer
    }

    @Override
    public void cookFood() {
        //not his job
    }
}
