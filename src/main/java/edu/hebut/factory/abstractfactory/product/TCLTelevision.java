package edu.hebut.factory.abstractfactory.product;

public class TCLTelevision implements Television {
    @Override
    public void broadcast() {
        System.out.println("TCL电视播放");
    }
}
