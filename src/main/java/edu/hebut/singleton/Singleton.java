package edu.hebut.singleton;

/**
 * 懒汉式，懒加载，线程不安全
 */
//public class Singleton {
//
//    private static Singleton instance;
//
//    private Singleton() {}
//
//    public static Singleton getInstance() {
//        if (instance == null) {
//            return new Singleton();
//        }
//        return instance;
//    }
//}

/**
 * 懒汉式，懒加载，线程安全
 */
//public class Singleton {
//
//    private static Singleton instance;
//
//    private Singleton() {}
//
//    public static synchronized Singleton getInstance() {
//        if (instance == null) {
//            return new Singleton();
//        }
//        return instance;
//    }
//}

/**
 * 饿汉式，非懒加载，线程安全，常用
 */
//public class Singleton {
//
//    private static Singleton instance = new Singleton();
//
//    private Singleton() {}
//
//    public static synchronized Singleton getInstance() {
//        return instance;
//    }
//}

/**
 * 双重校验锁
 * 懒汉式，懒加载，线程安全，jdk1.5以后
 */
public class Singleton {

    private volatile static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

/**
 * 登记式/静态内部类
 * 懒加载，线程安全
 */
//public class Singleton {
//    private static class SingletonHolder {
//        private static final Singleton INSTANCE = new Singleton();
//    }
//    private Singleton (){}
//    public static final Singleton getInstance() {
//        return SingletonHolder.INSTANCE;
//    }
//}

/**
 * 枚举
  */
//public enum Singleton {
//    INSTANCE;
//    public void whateverMethod() {
//    }
//}