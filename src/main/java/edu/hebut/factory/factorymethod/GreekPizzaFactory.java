package edu.hebut.factory.factorymethod;

import edu.hebut.factory.simplefactory.GreekPizza;
import edu.hebut.factory.simplefactory.Pizza;

public class GreekPizzaFactory implements PizzaFactory {
    @Override
    public Pizza createPizza() {
        return new GreekPizza();
    }
}
