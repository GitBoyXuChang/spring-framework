package com.jiagouedu.proccessor;

import com.jiagouedu.dao.UserDao;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * @ClassName: MyBeanFactoryProcessor
 * @Description:
 * @Author: Fox
 * @Date: 2019/3/31 22:29
 * @Version: 1.0
 */
@Component
public class MyBeanFactoryProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		AbstractBeanDefinition beanDefinition = (AbstractBeanDefinition) beanFactory.getBeanDefinition("userServiceImpl");
		beanDefinition.setAutowireMode(3);
	}
}
