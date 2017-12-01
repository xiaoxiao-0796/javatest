package com.xiaofei.base.model.adapter;

public class Test {

    public static void main(String[] args) {
        Targetable targetable = new Adapter();
        targetable.method1();
        targetable.method2();
        System.out.println("****************************");
        Targetable targetable1 = new Wrapper(new Source());
        targetable1.method1();
        targetable1.method2();

        Sourceable sourceable = new SourceSub1();
        sourceable.method1();
        Sourceable sourceable1 = new SourceSub2();
        sourceable1.method2();
    }
}
