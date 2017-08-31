package com.xiaofei.base.effective.Top39;

import java.util.Date;

/**
 * 类描述
 * <p>
 * 方法描述列表
 * </p>
 * User: xiao Date: 2017/7/19 0019 ProjectName: javatest
 */
public class Test {

    @org.junit.Test
    public void test1(){
        Date s = new Date();
        Date e = new Date();
        Tip39 tip39 = new Tip39(s,e);
        e.setTime(122222222);
        tip39.getStart().setTime(1222222222);
        System.out.println(tip39.getStart());
        System.out.println(tip39.getEnd());
    }
}
