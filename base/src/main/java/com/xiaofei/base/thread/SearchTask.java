package com.xiaofei.base.thread;

import java.util.Date;
import java.util.Random;

public class SearchTask  implements Runnable{

    private Result result;

    public SearchTask(Result result){
        this.result = result;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.printf("Thead %s :start \n",name);
        try{
            doTask();
            result.setName(name);
        }catch (InterruptedException e){
            System.out.printf("Thead %s:interrupted \n",name);
            return;
        }
        System.out.printf("Thread %s: end \n",name);
    }

    private void doTask() throws InterruptedException {
        Random random = new Random((new Date()).getTime());
        int time = (int)(random.nextDouble()*100);
        System.out.printf("Thread %s :%d \n",Thread.currentThread().getName(),time);
        Thread.sleep(time);
    }
}
