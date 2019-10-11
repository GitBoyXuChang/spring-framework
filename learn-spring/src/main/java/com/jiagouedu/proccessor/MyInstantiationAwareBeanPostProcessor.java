package com.jiagouedu.proccessor;

import com.jiagouedu.config.MyInvocationHandler;
import com.jiagouedu.service.UserService;
import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.lang.reflect.Proxy;

/**
 * @ClassName: userDao
 * @Description:
 * @Author: Fox
 * @Date: 2019/3/31 19:27
 * @Version: 1.0
 */
//@Component
public class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {
	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
//		if(beanName.equals("userServiceImpl"))
//			return Proxy.newProxyInstance(this.getClass().getClassLoader(),
//					new Class[]{UserService.class},new MyInvocationHandler());
		return null;
	}

	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessAfterInstantiation--------"+beanName);
		return true;
	}

	@Override
	public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
		return null;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("----Instantiation---BeforeInitialization -"+bean);
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("----Instantiation---AfterInitialization -"+bean);
		return bean;
	}
}
