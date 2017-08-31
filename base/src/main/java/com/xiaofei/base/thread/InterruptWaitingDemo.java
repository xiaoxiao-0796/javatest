package com.xiaofei.base.thread;

import org.junit.Test;

/**
 * 类描述
 * <p>
 * 方法描述列表
 * </p>
 * User: xiao Date: 2017/7/14 0014 ProjectName: javatest
 */
public class InterruptWaitingDemo {

    @Test
    public void test(){
        Thread t = new Thread (){
            @Override
            public void run() {
                try {
                    System.out.println("1");
                    Thread.sleep(1000);
                    System.out.println("2");
                } catch (InterruptedException e) {
                    //exception被捕获，但是为输出为false 因为标志位会被清空
                    System.out.println(isInterrupted());
                }
            }
        };
        t.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
        t.interrupt();//置为true
    }

    @Test
    public void test1(){
         Thread thread = new Thread(){
             @Override
             public void run() {
                 while (!Thread.currentThread().isInterrupted()) {
                     try {
                         // 模拟任务代码
                         Thread.sleep(2000);
                     } catch (InterruptedException e) {
                         System.out.println("1");
                         // ... 清理操作
                         // 重设中断标志位
                         Thread.currentThread().interrupt();
                     }
                 }
                 System.out.println(isInterrupted());
             }
         };

        thread.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
        thread.interrupt();
    }
}
