package com.xiaofei.base.thread;

public class ThreadGroupTest {

    public static void main(String[] args) {
        ThreadGroup threadGroup = new ThreadGroup("searcher");
        Result result = new Result();
        SearchTask searchTask =new SearchTask(result);
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(threadGroup,searchTask);
            thread.start();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.printf("Number of Threads %d \n",threadGroup.activeCount());
        System.out.printf("information of the thread group  :\n");
        threadGroup.list();
    }
}
