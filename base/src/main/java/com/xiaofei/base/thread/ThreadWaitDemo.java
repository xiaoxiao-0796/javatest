package com.xiaofei.base.thread;

import org.junit.Test;

/**
 * 类描述
 * <p>
 * 方法描述列表
 * </p>
 * User: xiao Date: 2017/7/14 0014 ProjectName: javatest
 */
public class ThreadWaitDemo {

    @Test
    public void test1(){
        Object object = new Object();
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (object) {
                    System.out.println("线程1 获取到监视器锁");
                    try {
                        object.wait();
                        System.out.println("线程1 恢复啦。我为什么这么久才恢复，因为notify方法虽然早就发生了，可是我还要获取锁才能继续执行。");
                    } catch (InterruptedException e) {
                        System.out.println("线程1 wait方法抛出了InterruptedException异常");
                    }
                }
            }
        }, "线程1").start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (object) {
                    System.out.println("线程2 拿到了监视器锁。为什么呢，因为线程1 在 wait 方法的时候会自动释放锁");
                    System.out.println("线程2 执行 notify 操作");
                    object.notify();
                    System.out.println("线程2 执行完了 notify，先休息3秒再说。");
                    try {
                        Thread.sleep(3000);
                        System.out.println("线程2 休息完啦。注意了，调sleep方法和wait方法不一样，不会释放监视器锁");
                    } catch (InterruptedException e) {
                    }
                    System.out.println("线程2 休息够了，结束操作");
                }
            }
        }, "线程2").start();
    }

    int a= 0;

    @Test
    public void test3(){
        Object object = new Object();
        ThreadWaitDemo waitNotify = new ThreadWaitDemo();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (object) {
                    System.out.println("线程1 获取到监视器锁");
                    try {
                        object.wait();
                        System.out.println("线程1 正常恢复啦。");
                    } catch (InterruptedException e) {
                        System.out.println("线程1 wait方法抛出了InterruptedException异常");
                    }
                }
            }
        }, "线程1");
        thread1.start();
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (object) {
                    System.out.println("线程2 获取到监视器锁");
                    try {
                        object.wait();
                        System.out.println("线程2 正常恢复啦。");
                    } catch (InterruptedException e) {
                        System.out.println("线程2 wait方法抛出了InterruptedException异常");
                    }
                }
            }
        }, "线程2");
        thread2.start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (object) {
                    System.out.println("线程3 拿到了监视器锁。");
                    System.out.println("线程3 设置线程1中断");
                    //我们可以在这两条语句之间加入些代码，防止它们重排序，
                    // 重排序的问题之后会说到。如果你是自己测试的话，要注意这点
                    thread1.interrupt();
                    waitNotify.a = 1; // 这行是为了禁止上下的两行中断和notify代码重排序
                    System.out.println("线程3 调用notify");
                    object.notify();
                    //
                    System.out.println("线程3 调用完notify后，休息一会");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                    System.out.println("线程3 休息够了，结束同步代码块");
                }
            }
        }, "线程3").start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}