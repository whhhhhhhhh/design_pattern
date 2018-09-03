package edu.hebut.factory.abstractfactory.product;

public class HaierTelevision implements Television {
    @Override
    public void broadcast() {
        System.out.println("Haier电视播放");
    }
}
