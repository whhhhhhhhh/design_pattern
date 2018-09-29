package edu.hebut.proxy.dynamicproxy.jdk;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKProxySubject implements InvocationHandler {

    private Object target;

    public JDKProxySubject(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before");
        Object result = method.invoke(target,args);
        System.out.println("after");
        return result;
    }

}
