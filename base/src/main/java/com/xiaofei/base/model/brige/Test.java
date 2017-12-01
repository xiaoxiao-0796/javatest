package com.xiaofei.base.model.brige;

/**
 * 桥接模式
 */
public class Test {
    public static void main(String[] args) {
        Brige brige = new MyBrige();

        Sourceable sourceable = new SourceSub1();
        brige.setSource(sourceable);
        brige.method();
    }
}
