package edu.hebut.observer;

import java.util.ArrayList;
import java.util.List;

public class XianFan1 implements Huairen {

    String name = "大熊";

    private List<Observer> observerList = new ArrayList<>();


    @Override
    public void addObserver(Observer observer) {
        if (!observerList.contains(observer)) {
            observerList.add(observer);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        if (observerList.contains(observer)) {
            observerList.remove(observer);
        }
    }

    @Override
    public void notice(String message) {
        for (Observer o:observerList) {
            o.update(message,name);
        }
    }
}
