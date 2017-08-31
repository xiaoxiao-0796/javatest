package com.xiaofei.base.thread;

/**
 * 类描述
 * <p>
 * 方法描述列表
 * </p>
 * User: xiao Date: 2017/7/14 0014 ProjectName: javatest
 */
public class InterruptRunnableDemo extends Thread {

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            // ... 单次循环代码
            System.out.println("hello java");
        }
        System.out.println("done ");
    }
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new InterruptRunnableDemo();
        thread.start();
        Thread.sleep(1000);
        thread.interrupt();
    }
}
