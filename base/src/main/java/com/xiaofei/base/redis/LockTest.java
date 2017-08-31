package com.xiaofei.base.redis;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 类描述
 * <p>
 * 方法描述列表
 * </p>
 * User: xiao Date: 2017/8/15 0015 ProjectName: javatest
 */
public class LockTest implements Runnable{

    static Lock lock1 = new ReentrantLock();
    static Lock lock2 = new ReentrantLock();
    static List<Lock> list = new ArrayList<Lock>(){
        {
            add(lock1);
            add(lock2);
        }
    };


    public static void main(String[] args) {
        LockTest test = new LockTest();
        Thread thread = new Thread(test);
        thread.start();
        Thread thread1 = new Thread(test);
        thread1.start();
    }



    @Override
    public void run() {
        Lock lock = list.remove(0);
        System.out.println(lock.toString());
        lock.lock();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("hello !");
        lock.unlock();
    }
}
