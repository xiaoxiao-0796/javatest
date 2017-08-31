package com.xiaofei.base.thread;

import org.junit.Test;

import java.util.concurrent.*;

/**
 * 类描述
 * <p>
 * 方法描述列表
 * </p>
 * User: xiao Date: 2017/7/14 0014 ProjectName: javatest
 */
public class ThreadPoolDemo {

    @Test
    public void test1() {
        Thread t = new Thread (){
            @Override
            public void run() {
                System.out.println("1");
            }
        };
        ExecutorService executor =
                new ThreadPoolExecutor(5,5,0l, TimeUnit.SECONDS, new LinkedBlockingQueue());
        executor.execute(t);
        executor.shutdown();
    }

    @Test
    public void test2(){
        Callable<String> t = new Callable (){
            @Override
            public String call() throws Exception {
                return "1";
            }
        };
        ExecutorService executor = Executors.newFixedThreadPool(5);
        Future<String> submit = executor.submit(t);
        try {
            String o = submit.get();
            System.out.println(o);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test3() throws Exception {
        Thread t = new Thread (){
            @Override
            public void run() {
                System.out.println("1");
            }
        };
        ScheduledExecutorService e = Executors.newScheduledThreadPool(5);
        e.scheduleAtFixedRate(t,0,2,TimeUnit.SECONDS);  //每两秒执行一次
//        e.scheduleWithFixedDelay(t,0,2,TimeUnit.SECONDS);
        Thread.sleep(10000);
    }
}
