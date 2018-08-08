package edu.hebut.proxy.dynamicProxy.cglib;

public class Client {

    public static void main(String[] args) {

        CglibProxy cglibProxy = new CglibProxy();
        Car carProxy = (Car) cglibProxy.getProxy(Car.class);
        carProxy.move();
    }

}
