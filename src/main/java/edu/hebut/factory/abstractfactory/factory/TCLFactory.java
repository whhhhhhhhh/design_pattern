package edu.hebut.factory.abstractfactory.factory;

import edu.hebut.factory.abstractfactory.product.Fridge;
import edu.hebut.factory.abstractfactory.product.TCLFridge;
import edu.hebut.factory.abstractfactory.product.TCLTelevision;
import edu.hebut.factory.abstractfactory.product.Television;

public class TCLFactory implements Factory {
    @Override
    public Television createTelevision() {
        return new TCLTelevision();
    }

    @Override
    public Fridge createFridge() {
        return new TCLFridge();
    }
}
