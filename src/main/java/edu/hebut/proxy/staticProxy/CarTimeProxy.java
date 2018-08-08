package edu.hebut.proxy.staticProxy;

import edu.hebut.proxy.dynamicProxy.jdk.Moveable;

import java.util.Date;

public class CarTimeProxy implements Moveable {
    private Moveable m;

    public CarTimeProxy(Moveable m) {
        super();
        this.m = m;
    }

    @Override
    public void move() {
        System.out.println("starting time:" + new Date());
        m.move();
        System.out.println("end time:" + new Date());
    }
}
