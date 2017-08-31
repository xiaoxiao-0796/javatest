package com.xiaofei.base.thread;

import static com.xiaofei.base.thread.Test.*;
/**
 * 类描述
 * <p>
 * 方法描述列表
 * </p>
 * User: xiao Date: 2017/7/18 0018 ProjectName: javatest
 */
public class Consumer implements Runnable {

    @Override
    public synchronized void run() {
        while(true) {
            lock.lock();
            try {
                if (Test.count <= 0) coms.await();
                    System.out.print("B");
                    Test.count--;
                    prod.signal();
             }catch (Exception e){
                e.printStackTrace();
             }finally {
                lock.unlock();
             }
        }

    }
}
