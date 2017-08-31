package com.xiaofei.base.redis;

import redis.clients.jedis.Jedis;

/**
 * 类描述
 * <p>
 * 方法描述列表
 * </p>
 * User: xiao Date: 2017/7/6 0006 ProjectName: javatest
 */
public class RedisStringJava {

    public static void main(String[] args) {
        //Connecting to Redis server on localhost
        Jedis jedis = new Jedis("localhost");
        System.out.println("Connection to server sucessfully");
        //set the data in redis string
        jedis.set("tutorialname", "Redis tutorial","nx","ex",3);
        // Get the stored data and print it
        System.out.println("Stored string in redis:: "+ jedis.get("tutorialname"));
    }
}
