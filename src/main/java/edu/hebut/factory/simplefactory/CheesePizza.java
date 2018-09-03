package edu.hebut.factory.simplefactory;

public class CheesePizza extends Pizza {

    @Override
    public void prepare(){
        System.out.println("准备CheesePizza~");
    }
    @Override
    public void bake(){
        System.out.println("正在烤CheesePizza~");
    }
    @Override
    public void cut(){
        System.out.println("正在切CheesePizza~");
    }
    @Override
    public void box(){
        System.out.println("正在打包CheesePizza~");
    }
}
