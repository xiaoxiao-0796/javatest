package com.xiaofei.base.thread;

import static com.xiaofei.base.thread.Test.*;

/**
 * 类描述
 * <p>
 * 方法描述列表
 * </p>
 * User: xiao Date: 2017/7/18 0018 ProjectName: javatest
 */
public class Produce implements Runnable {

    @Override
    public void run() {
        while(true) {
            lock.lock();
            try {
                if (Test.count > 0) prod.await();
                    System.out.print("A");
                    Test.count++;
                    coms.signal();
            }catch (Exception e){
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }
}
