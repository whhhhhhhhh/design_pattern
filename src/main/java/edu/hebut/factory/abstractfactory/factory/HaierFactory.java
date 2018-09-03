package edu.hebut.factory.abstractfactory.factory;

import edu.hebut.factory.abstractfactory.product.Fridge;
import edu.hebut.factory.abstractfactory.product.HaierFridge;
import edu.hebut.factory.abstractfactory.product.HaierTelevision;
import edu.hebut.factory.abstractfactory.product.Television;

/**
 * 产品族是指由同一个工厂生产的，位于不同产品等级结构中的一组产品
 */
public class HaierFactory implements Factory {
    @Override
    public Television createTelevision() {
        return new HaierTelevision();
    }

    @Override
    public Fridge createFridge() {
        return new HaierFridge();
    }
}
