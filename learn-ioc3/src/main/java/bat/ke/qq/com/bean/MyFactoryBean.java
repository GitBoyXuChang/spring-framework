package bat.ke.qq.com.bean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.stereotype.Component;

@Component
public class MyFactoryBean implements FactoryBean<Object> {

	@Override
	public Object getObject() throws Exception {
		return new Object();
	}

	@Override
	public Class<?> getObjectType() {
		return Object.class;
	}
}
