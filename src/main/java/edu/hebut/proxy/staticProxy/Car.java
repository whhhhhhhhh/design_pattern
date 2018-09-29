package edu.hebut.proxy.staticProxy;

import edu.hebut.proxy.dynamicproxy.jdk.Moveable;

public class Car implements Moveable {
    @Override
    public void move() {
        System.out.println("car move");
    }
}
