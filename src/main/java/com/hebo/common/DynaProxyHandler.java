package com.hebo.common;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by hebo on 2018/4/9.
 */
public class DynaProxyHandler implements InvocationHandler {

    private Object object;

    public DynaProxyHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(object, args);
    }
}
