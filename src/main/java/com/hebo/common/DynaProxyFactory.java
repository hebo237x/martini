package com.hebo.common;

import java.lang.reflect.Proxy;

/**
 * Created by hebo on 2018/4/9.
 * 生产代理对象工厂
 */
public class DynaProxyFactory {

    public static Object getProxy(Object obj){
        DynaProxyHandler handler = new DynaProxyHandler(obj);
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), handler);

    }
}
