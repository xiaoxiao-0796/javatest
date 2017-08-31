package com.xiaofei.base.thread;

/**
 * 类描述
 * <p>
 * 方法描述列表
 * </p>
 * User: xiao Date: 2017/7/17 0017 ProjectName: javatest
 */

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

/**
 * 模拟运动员
 **/
public class MyThread extends Thread {
    private CyclicBarrier cyclicBarrier;

    private String name;

    private int ID;

    public MyThread(CyclicBarrier cyclicBarrier, String name,int ID) {
        super();
        this.cyclicBarrier = cyclicBarrier;
        this.name = name;
        this.ID = ID;
    }
    @Override
    public void run() {
        System.out.println(name + "开始准备");
        try {
            Thread.currentThread().sleep(ID*1000);
            System.out.println(name + "准备完毕！等待发令枪");
            try {
                //如果超出指定的等待时间，当前线程会抛出 TimeoutException 异常，其他线程会抛出BrokenBarrierException异常。
//                cyclicBarrier.await(ID * 1000, TimeUnit.MILLISECONDS);
                cyclicBarrier.await();
                System.out.println(name + "跑完了路程！");
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(name+"看不见起跑线了");
            }
            System.out.println(name+"退场！");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}


