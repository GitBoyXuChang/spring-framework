
import bat.ke.qq.com.bean.Fox;
import bat.ke.qq.com.config.AppConfig;
import org.junit.Test;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * 源码学院-Fox
 * 只为培养BAT程序员而生
 * http://bat.ke.qq.com
 * 往期视频加群:516212256 暗号:6
 */
public class IOCTest {

	@Test
	public void test(){
		// java Configuration
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(AppConfig.class);

		System.out.println(context.getBean("user"));
		//System.out.println(context.getBean("a"));

		// 通过容器获取到beanFactory  即是工厂，又是注册器
		DefaultListableBeanFactory factory = context.getDefaultListableBeanFactory();

		RootBeanDefinition beanDefinition = new RootBeanDefinition(Fox.class);
		factory.registerBeanDefinition("fox",beanDefinition);

		beanDefinition.setAutowireMode(2);

		// spring   填充属性
		beanDefinition.getPropertyValues().add("name","foxxx");

		System.out.println(context.getBean("fox"));
//
//		//System.out.println(context.getBean("myFactroyBean"));//ReentrantLock
//		//System.out.println(context.getBean("&myFactroyBean"));//MyFactroyBean


	}




}
