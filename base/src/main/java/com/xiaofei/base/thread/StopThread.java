package com.xiaofei.base.thread;

public class StopThread {

    private static boolean stopRequested;

    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int i=0;
                while(!stopRequested){
                    i++;
                }
            }
        });
        thread.start();
        System.out.println("123");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("12345");
        stopRequested = true;
        System.out.println("098765");
    }
}
