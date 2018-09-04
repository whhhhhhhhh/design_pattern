package edu.hebut.observer;

import java.util.ArrayList;
import java.util.List;

public class XianFan2 implements Huairen {

    private String name = "黑狗";

    private List<Observer> observerList = new ArrayList<Observer>();

    @Override
    public void addObserver(Observer observer) {
        if(!observerList.contains(observer)){
            observerList.add(observer);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        if(observerList.contains(observer)){
            observerList.remove(observer);
        }
    }

    @Override
    public void notice(String message) {
        for(Observer observer:observerList){
            observer.update(message,name);
        }
    }
}
