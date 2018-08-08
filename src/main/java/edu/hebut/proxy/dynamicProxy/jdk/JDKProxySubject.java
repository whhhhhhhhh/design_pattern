package edu.hebut.proxy.dynamicProxy.jdk;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKProxySubject implements InvocationHandler {

    private Object target;
    //绑定委托对象，并返回代理
    public Object bind(Object target) {
        this.target = target;
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),this.getClass().getInterfaces()
                ,this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }

}
