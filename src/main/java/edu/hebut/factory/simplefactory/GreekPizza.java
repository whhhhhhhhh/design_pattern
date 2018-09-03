package edu.hebut.factory.simplefactory;

public class GreekPizza extends Pizza{

    @Override
    public void prepare(){
        System.out.println("准备GreekPizza~");
    }
    @Override
    public void bake(){
        System.out.println("正在烤GreekPizza~");
    }
    @Override
    public void cut(){
        System.out.println("正在切GreekPizza~");
    }
    @Override
    public void box(){
        System.out.println("正在打包GreekPizza~");
    }

}
