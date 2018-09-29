package edu.hebut.proxy.dynamicproxy.cglib;

import edu.hebut.proxy.dynamicproxy.jdk.Moveable;

public class Car implements Moveable {
    @Override
    public void move() {
        System.out.println("car move");
    }
}
