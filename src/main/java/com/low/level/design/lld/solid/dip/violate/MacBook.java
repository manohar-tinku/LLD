package com.low.level.design.lld.solid.dip.violate;

//it violates dependency inversion principle -> class should not depend directly on concrete classes, instead depend on interfaces
//why? in future what if I want to use BlueToothMouse, I cannot use right?
public class MacBook {
    private BlueToothKeyboard blueToothKeyboard;
    private WiredMouse wiredMouse;

    public MacBook(BlueToothKeyboard blueToothKeyboard, WiredMouse wiredMouse) {
        this.blueToothKeyboard = blueToothKeyboard;
        this.wiredMouse = wiredMouse;
    }
}
