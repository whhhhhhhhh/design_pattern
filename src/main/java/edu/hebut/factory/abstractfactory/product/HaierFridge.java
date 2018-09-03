package edu.hebut.factory.abstractfactory.product;

public class HaierFridge implements Fridge {
    @Override
    public void refrigeration() {
        System.out.println("Haier冰箱制冷");
    }
}
