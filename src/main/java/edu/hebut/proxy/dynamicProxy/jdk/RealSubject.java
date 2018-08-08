package edu.hebut.proxy.dynamicProxy.jdk;

public class RealSubject implements Subject {
    @Override
    public void doSomething() {
        System.out.println("i am the real");
    }
}
