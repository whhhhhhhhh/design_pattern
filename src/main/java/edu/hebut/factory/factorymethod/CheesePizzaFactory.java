package edu.hebut.factory.factorymethod;

import edu.hebut.factory.simplefactory.CheesePizza;
import edu.hebut.factory.simplefactory.Pizza;

public class CheesePizzaFactory implements PizzaFactory {
    @Override
    public Pizza createPizza() {
        return new CheesePizza();
    }
}
