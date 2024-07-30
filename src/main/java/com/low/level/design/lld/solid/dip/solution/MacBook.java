package com.low.level.design.lld.solid.dip.solution;

//now we can use any type wired or bluetooth any combination
public class MacBook {
    private KeyBoard keyBoard;
    private Mouse mouse;

    public MacBook(KeyBoard keyBoard, Mouse mouse) {
        this.keyBoard = keyBoard;
        this.mouse = mouse;
    }
}
