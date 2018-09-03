package edu.hebut.factory.factorymethod;

import edu.hebut.factory.simplefactory.Pizza;

/**
 * 工厂方法模式跟简单工厂模式在结构上的不同是很明显的，工厂方法模式的核心是一个抽象工厂类，
 * 而简单工厂模式的核心在一个具体类。显而易见工厂方法模式这种结构更好扩展，权力下发，分布式比集中式更具优势。
 */
public interface PizzaFactory {

    public Pizza createPizza();

}
