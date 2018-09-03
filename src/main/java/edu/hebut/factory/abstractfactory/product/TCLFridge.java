package edu.hebut.factory.abstractfactory.product;

public class TCLFridge implements Fridge {
    @Override
    public void refrigeration() {
        System.out.println("TCL冰箱制冷");
    }
}
