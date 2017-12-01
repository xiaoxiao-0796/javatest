package com.xiaofei.base.model.singleton;

public class Singleton2 {

    private static Singleton2 singleton = null;

    private Singleton2(){}

    public static Singleton2 getInstance(){
        if (singleton ==null){
            /*synchronized (singleton){
                if (singleton == null){
                    singleton = new Singleton2();

                }
            }*/
            syncInit();
        }
        return singleton;
    }

    private static synchronized void syncInit() {
        if (singleton == null) {
            singleton = new Singleton2();
        }
    }
}
