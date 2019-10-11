package com.jiagouedu.config;

import com.jiagouedu.bean.Person;
import com.jiagouedu.bean.User;
import com.jiagouedu.service.UserServiceImpl;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @ClassName: Person
 * @Description:
 * @Author:
 * @Date: 2019/3/26 12:39
 * @Version: 1.0
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		BeanDefinition beanDefinition = new RootBeanDefinition(UserServiceImpl.class);
		registry.registerBeanDefinition("userServiceImpl",beanDefinition);
		((RootBeanDefinition) beanDefinition).setAutowireMode(2);
	}
}
