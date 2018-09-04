package edu.hebut.adapter;

/**
 * 适配器模式
 *
 * 想要使用一个已经存在的类，但是它却不符合现有的接口规范，导致无法直接去访问，这时创建一个适配器就能间接去访问这个类中的方法。
 */
public interface AdvancedMediaPlayer {

    public void playVlc(String fileName);
    public void playMp4(String fileName);

}
