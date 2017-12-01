package com.xiaofei.base.model.singleton;

/**
 * 优化单例--线程安全
 */
public class Singleton1 {

    private Singleton1(){}

    private static class SingletonFactory{
        private static Singleton1 singleton1 = new Singleton1();
    }

    public Singleton1 getInstance(){
        return SingletonFactory.singleton1;
    }

    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
    public Object readResolve() {
        return getInstance();
    }
}
