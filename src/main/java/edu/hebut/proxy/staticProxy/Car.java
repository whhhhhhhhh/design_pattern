package edu.hebut.proxy.staticProxy;

import edu.hebut.proxy.dynamicProxy.jdk.Moveable;

public class Car implements Moveable {
    @Override
    public void move() {
        System.out.println("car move");
    }
}
