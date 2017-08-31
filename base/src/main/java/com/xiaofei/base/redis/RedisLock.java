package com.xiaofei.base.redis;

import org.junit.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.Response;
import redis.clients.jedis.Transaction;

import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 类描述
 * <p>
 * 方法描述列表
 * </p>
 * User: xiao Date: 2017/8/15 0015 ProjectName: javatest
 */
public class RedisLock{

    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost");
        Transaction t = jedis.multi();// 开始事务

        t.zadd("xiao",189, "{id:234,name:fei}");
        t.exec(); //提交事务
//        t.discard(); //取消事务
        Set<String> zrange = jedis.zrange("xiao", 0l, 1000l);
        System.out.println(zrange.toString());
    }

}
