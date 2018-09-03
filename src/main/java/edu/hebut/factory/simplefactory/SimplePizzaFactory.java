package edu.hebut.factory.simplefactory;

/**
 * 简单工厂
 *
 * 这个工厂类集中了所有的创建逻辑，当有复杂的多层次等级结构时，所有的业务逻辑都在这个工厂类中实现。
 * 什么时候它不能工作了，整个系统都会受到影响。并且简单工厂模式违背了开闭原则（对扩展的开放，对修改的关闭）。
 */
public class SimplePizzaFactory {

    public static Pizza CreatePizza(String orderType){
        Pizza pizza = null;
        if ("cheese".equals(orderType)) {
            pizza = new CheesePizza();
        } else if ("greek".equals(orderType)) {
            pizza = new GreekPizza();
        }
        return pizza;
    }

}
