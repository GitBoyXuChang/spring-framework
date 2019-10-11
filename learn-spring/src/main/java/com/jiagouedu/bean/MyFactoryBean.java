package com.jiagouedu.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @ClassName: MyFactoryBean
 * @Description:
 * @Author:
 * @Date: 2019/3/25 17:01
 * @Version: 1.0
 */
public class MyFactoryBean implements FactoryBean {
	@Override
	public Object getObject() throws Exception {
		return new Fox();
	}

	@Override
	public Class<?> getObjectType() {
		return Fox.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}
}
