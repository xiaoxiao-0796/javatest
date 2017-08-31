package com.xiaofei.base.trage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理处理类
 * <p>
 * 方法描述列表
 * </p>
 * User: xiao Date: 2017/7/19 0019 ProjectName: javatest
 */
public class ProxyHandler implements InvocationHandler{

    //被代理对象
    private Object mTarget;

    public ProxyHandler(Object target) {
        this.mTarget = target;
    }

    /**
     * 方法拦截，可以进行一些额外操作
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理前--------");
        Object invoke = method.invoke(mTarget, args);
        System.out.println("代理后=========");
        return invoke;
    }

    /**
     * 获取代理
     * @return
     */
    public Object getProxy() {
        return Proxy.newProxyInstance(mTarget.getClass().getClassLoader(), mTarget.getClass().getInterfaces(), this);
    }
}
