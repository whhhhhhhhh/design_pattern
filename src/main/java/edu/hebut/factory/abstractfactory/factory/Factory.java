package edu.hebut.factory.abstractfactory.factory;

import edu.hebut.factory.abstractfactory.product.Fridge;
import edu.hebut.factory.abstractfactory.product.Television;

public interface Factory {

    Television createTelevision();
    Fridge createFridge();

}
