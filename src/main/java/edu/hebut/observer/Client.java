package edu.hebut.observer;

public class Client {

    public static void main(String[] args) {
        Observer bianyi1 = new Bianyi1();
        Observer bianyi2 = new Bianyi2();
        Observer bianyi3 = new Bianyi3();
        Huairen daxiong = new XianFan1();
        daxiong.addObserver(bianyi1);
        daxiong.addObserver(bianyi2);
        daxiong.addObserver(bianyi3);
        daxiong.notice("又卖了一批货");
    }

}
