package com.jiagouedu.proccessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @ClassName: MyBeanPostProcessor
 * @Description:
 * @Author:
 * @Date: 2019/3/24 19:29
 * @Version: 1.0
 */
//@Component
public class MyBeanPostProcessor implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("----BeforeInitialization----------"+bean+"------"+beanName);
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("---AfterInitialization----------"+bean+"------"+beanName);
		return bean;
	}
}
