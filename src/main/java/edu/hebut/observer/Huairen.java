package edu.hebut.observer;

public interface Huairen {

    /**
     * 添加便衣观察者
     * @param observer
     */
    void addObserver(Observer observer);

    /**
     * 移除便衣观察者
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * 通知观察者
     * @param message
     */
    void notice(String message);

}
