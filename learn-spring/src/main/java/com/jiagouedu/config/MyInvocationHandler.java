package com.jiagouedu.config;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @ClassName: MyInvocationHandler
 * @Description:
 * @Author: Fox
 * @Date: 2019/3/31 20:24
 * @Version: 1.0
 */
public class MyInvocationHandler implements InvocationHandler {
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("invoke");
		return null;
	}
}
