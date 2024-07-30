package com.low.level.design.lld.solid.lsp.violate;

public class Bicycle implements Bike{
    //violates the principle, according to it -> child class has to substitutable for their parent class
    //without interrupting the behaviour of the program
    @Override
    public void turnOnEngine() {
        //throws exception as bicycle doesn't have engine
    }

    @Override
    public void accelerate() {
        //increase speed
    }
}
