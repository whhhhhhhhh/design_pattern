package edu.hebut.proxy.staticProxy;

import edu.hebut.proxy.dynamicProxy.jdk.Moveable;

public class CarLogProxy implements Moveable {

    private Moveable m;

    public CarLogProxy(Moveable m) {
        super();
        this.m = m;
    }

    @Override
    public void move() {
        System.out.println("starting record log");
        m.move();
        System.out.println("end record log");
    }
}
