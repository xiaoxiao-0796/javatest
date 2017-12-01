package com.xiaofei.base.model.chain;


/**
 * 责任链模式，
 * 有多个对象，每个对象持有对下一个对象的引用，
 * 这样就会形成一条链，请求在这条链上传递，直到某一对象决定处理该请求。
 * 但是发出者并不清楚到底最终那个对象会处理该请求，
 * 所以，责任链模式可以实现，在隐瞒客户端的情况下，对系统进行动态的调整。
 */
public class Test {

    public static void main(String[] args) {
        AbHandle handle1 = new MyHandle("1");
        AbHandle handle2 = new MyHandle("2");
        AbHandle handle3 = new MyHandle("3");
        AbHandle handle4 = new MyHandle("4");
        handle1.setHandle(handle2);
        handle2.setHandle(handle3);
        handle3.setHandle(handle4);
        handle1.operation("4");
    }
}
