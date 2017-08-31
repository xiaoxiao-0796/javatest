package com.xiaofei.base.thread;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CyclicBarrier;

/**
 * 集中处理多线程
 * <p>
 * 方法描述列表
 * </p>
 * User: xiao Date: 2017/7/17 0017 ProjectName: javatest
 */
public class CyclicBarrierTest {

    public static Map<Integer,Thread> map = new HashMap<>();

    public static void main(String[] args) throws InterruptedException {
        CyclicBarrier barrier = new CyclicBarrier(5, new Runnable() {
            @Override
            public void run() {
                //如果在执行屏障操作过程中发生异常，则该异常将传播到当前线程中，
                // 其他线程会抛出BrokenBarrierException，屏障被损坏。
//                String str = null;
//                str.substring(0, 1);
                System.out.println("发令枪响了，跑！");
            }
        });
        for (int i = 0; i < 10; i++) {
            MyThread thread = new MyThread(barrier, "运动员" + i + "号", i);
            map.put(i,thread);
            thread.start();
        }
        Thread.sleep(2000);
        // 如果有线程已经处于等待状态，调用reset方法会导致已经在等待的线程出现BrokenBarrierException异常。
        // 并且由于出现了BrokenBarrierException，将会导致始终无法等待
//        barrier.reset();
        //如果在等待的过程中，线程被中断，
        // 也会抛出BrokenBarrierException异常，并且这个异常会传播到其他所有的线程。
//       map.get(1).interrupt();
    }
}
