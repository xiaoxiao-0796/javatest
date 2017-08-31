package com.xiaofei.base.trage;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.theories.internal.Assignments;

import java.io.IOException;

/**
 * 类描述
 * <p>
 * 方法描述列表
 * </p>
 * User: xiao Date: 2017/7/19 0019 ProjectName: javatest
 */
public class ProxyTest {

    /**
     * 静态代理测试
     */
    @Test
    public void statictest(){
        Star star = new Star("xiao");
        Agent agent = new Agent(star);
        agent.movieShow(900000000);
        agent.tvShow(5);
    }

    /**
     * 动态代理
     */
    @Test
    public void dongtaitest(){
        Star star = new Star("xiao");
        ProxyHandler proxyHandler = new ProxyHandler(star);
        IMovieStar movieStar =  (IMovieStar) proxyHandler.getProxy();
        movieStar.movieShow(900000000);
        movieStar.tvShow(5);
    }

    @Test
    public void test() throws Exception {
        assert 1==3;
    }
}
