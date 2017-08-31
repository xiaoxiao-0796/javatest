package com.xiaofei.base.thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 类描述
 * <p>
 * 方法描述列表
 * </p>
 * User: xiao Date: 2017/7/18 0018 ProjectName: javatest
 */
public class Test {

    public static final Object obj = new Object();

    public static volatile int count = 0;

    public static final Lock lock = new ReentrantLock();//锁对象
    public static final Condition prod  = lock.newCondition();//
    public static final Condition coms = lock.newCondition();//

    public static void main(String[] args) {
        new Thread( new Produce()).start();
        new Thread( new Consumer()).start();
    }
}
