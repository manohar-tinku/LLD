package com.low.level.design.lld.solid.lsp.solution;

public class MotorBike implements AccelerateBike,EngineBike{
    @Override
    public void accelerate() {
        //increase speed
    }

    @Override
    public void turnOnEngine() {
        //turn on engine
    }
}
