package com.xiaofei.base.thread;

import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.concurrent.*;

public class FutureTest {

    public static void main(String[] args){
        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<String> future = executorService.submit(() -> {
            System.out.println("running task");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "task";
        });
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }

        System.out.println("do something else");  //前面的的 Callable 在其他线程中运行着，可以做一些其他的事情

        try {
            System.out.println(future.get(2, TimeUnit.SECONDS));  //等待 future 的执行结果，执行完毕之后打印出来
        } catch (InterruptedException e) {
        } catch (Exception e) {

        } finally {
            executorService.shutdown();
        }

    }

    @Test
    public void test1(){
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            System.out.println("Hello");
        });

        try {
            future.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        System.out.println("CompletableFuture");

    }


    @Test
    public void test2(){
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> "Hello");

        try {
            System.out.println(future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        System.out.println("CompletableFuture");
    }

    @Test
    public void test3(){
        CompletableFuture<String> future  = CompletableFuture.supplyAsync(() -> "Hello");

        future.complete("World");//立即执行

        try {
            System.out.println(future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test4(){
        CompletableFuture<String> future  = CompletableFuture.supplyAsync(() -> "Hello");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        future.complete("World");//立即执行

        try {
            System.out.println(future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test5(){
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> "Hello");

        future.completeExceptionally(new Exception());

        try {
            System.out.println(future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}
