
import bat.ke.qq.com.bean.Fox;
import bat.ke.qq.com.bean.User;
import bat.ke.qq.com.common.MyBeanPostProcessor;
import bat.ke.qq.com.config.AppConfig;
import org.junit.Test;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.PropertyValue;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.support.*;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.DefaultResourceLoader;

import java.net.ServerSocket;
import java.util.Arrays;

/**
 * 源码学院-Fox
 * 只为培养BAT程序员而生
 * http://bat.ke.qq.com
 * 往期视频加群:516212256 暗号:6
 *
 */
public class IOCTest {

	@Test
	public void test(){
		// xml方式
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		// 为什么加&符号返回的是原生的
//		System.out.println(context.getBean("myFactoryBean"));// user   getObject()
		System.out.println(context.getBean("&myFactoryBean"));// MyFactoryBean@3b2da18f

		//((ClassPathXmlApplicationContext) context).close();


	}

	@Test
	public void test2(){
		// java Configuration
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(AppConfig.class);

		System.out.println(context.getBean("appConfig"));

		context.getBean("fox");

		context.close();


	}


	@Test
	public void test3(){
		//创建一个简单注册器
		//BeanDefinitionRegistry register = new SimpleBeanDefinitionRegistry();
		// 创建一个工厂  即实现BeanDefinitionRegistry 又实现 BeanFactory
		DefaultListableBeanFactory register = new DefaultListableBeanFactory();

		//创建bean定义读取器
		//BeanDefinitionReader reader = new XmlBeanDefinitionReader(register);

		// 加载配置文件
		//reader.loadBeanDefinitions("spring.xml");

		//  所有注册bean
		//System.out.println(register.getBeanDefinitionNames().length);

		AbstractBeanDefinition beanDefinition = new RootBeanDefinition(User.class);
		// 填充属性
		beanDefinition.getPropertyValues().add("name","xxxxx");

		register.registerBeanDefinition("user",beanDefinition);


		// 从注册器中获取bean定义
		//System.out.println(register.getBeanDefinition("fox"));

		System.out.println(register.getBean("user"));


//		//定义bean
//		AbstractBeanDefinition beanDefinition = new RootBeanDefinition(User.class);
//
//		// 设置属性
//		beanDefinition.getPropertyValues().add("name","xxxxx");
//		// 注册bean
//		register.registerBeanDefinition("user",beanDefinition);
//
//
//		System.out.println(register.getBeanDefinition("user"));
//
//
//		//System.out.println(register.getBean("user"));
//
//
//		register.addBeanPostProcessor((BeanPostProcessor) register.getBean("myBeanPostProcessor"));
//
//		System.out.println(register.getBean("user"));


	}

}
