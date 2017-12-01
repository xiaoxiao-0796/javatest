package com.xiaofei.base.model.singleton;

/**
 * 单例
 */
public class Singleton {

    /**
     * 私有静态实例防止被引用
     */
    private static Singleton singleton = null;

    /**
     * 私有构造方法，防止被实例化
     */
    private Singleton(){}

    /**
     * 静态方法创建实例
     * @return
     */
    public static Singleton getInstance(){
        if (singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }

    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
    public Object readResolve() {
        return singleton;
    }
}
