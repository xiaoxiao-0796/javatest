package com.xiaofei.base.log;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.slf4j.MDC;

/**
 * 类描述
 * <p>
 * 方法描述列表
 * </p>
 * User: xiao Date: 2017/7/6 0006 ProjectName: javatest
 */
@Slf4j
public class LogTest {

    @Test
    public void log(){
        MDC.put("TRACE_LOG_ID","fdshfladshfkdshalja");
        log.debug("debug----------{},{},{}",1,3,5);
         log.info("info------------{},{},{},{}",2,4,6,9);
        log.warn("warn--------------");
        log.error("error------------");
        "123".equals("123");
    }

    @Test
    public void test1(){

        int num=18;
        //十进制转二进制
        String binaryString = Integer.toBinaryString(num);
        System.out.printf(binaryString);

    }
}
