package edu.hebut.factory.abstractfactory;

import edu.hebut.factory.abstractfactory.factory.Factory;
import edu.hebut.factory.abstractfactory.factory.HaierFactory;
import edu.hebut.factory.abstractfactory.product.Television;

public class Client {

    public static void main(String[] args) {
        Factory haierFactory = new HaierFactory();
        Television haierTelevision = haierFactory.createTelevision();
        haierTelevision.broadcast();
    }

}
