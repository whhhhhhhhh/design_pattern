package edu.hebut.proxy.dynamicproxy.jdk;

import java.lang.reflect.Proxy;

public class ProxyFactory {

    public static Object getProxy(Object target) {
        JDKProxySubject handler = new JDKProxySubject(target);
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),handler);
    }

    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        Subject proxy = (Subject) ProxyFactory.getProxy(realSubject);
        proxy.doSomething();
    }
}
