package com.xiaofei.base.thread;

/**
 * 类描述
 * <p>
 * 方法描述列表
 * </p>
 * User: xiao Date: 2017/7/14 0014 ProjectName: javatest
 */
public class InterruptNotAliveDemo {

    private static class A extends Thread {
        @Override
        public void run() {
        }
    }

    public static void test() throws InterruptedException {
        A a = new A();
        a.interrupt();
        System.out.println(a.isInterrupted());

        a.start();
        Thread.sleep(100);
        a.interrupt();
        System.out.println(a.isInterrupted());
    }

    public static void main(String[] args) throws InterruptedException {
        test();
    }
}
