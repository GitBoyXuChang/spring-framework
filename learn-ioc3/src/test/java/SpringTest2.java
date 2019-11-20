import bat.ke.qq.com.config.AppConfig;
import org.junit.Test;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;


public class SpringTest2 {

	@Test
	public void test(){
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		//System.out.println(context.getBean("myFactoryBean")); //getObject
		//System.out.println(context.getBean("&myFactoryBean")); //myFactoryBean
//		System.out.println(context.getBean("foxProxy"));
		System.out.println(context.getBean("person"));

//
////		// 拿到工厂
//		BeanFactory beanFactory = ((AnnotationConfigApplicationContext) context).getDefaultListableBeanFactory();
//
//		//创建一个beanDefinition
//		RootBeanDefinition beanDefinition = new RootBeanDefinition(Monkey.class);
//
//		// 注册
//		((DefaultListableBeanFactory) beanFactory).registerBeanDefinition("monkey",beanDefinition);
//
//		//填充属性
//		beanDefinition.getPropertyValues().add("name","xxxx");
//
//		// autowireMode==3  构造器贪婪模式
//		beanDefinition.setAutowireMode(3);
//
//		System.out.println(context.getBean("monkey"));



	}

	@Test
	public void test2(){
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		System.out.println(context.getBean("person"));

		//创建一个简单注册器   map  key---beanDefiniton
		//BeanDefinitionRegistry register = new SimpleBeanDefinitionRegistry();

		//创建一个实现了注册器的工厂   即是一个工厂，又是一个注册器
//		BeanDefinitionRegistry register = new DefaultListableBeanFactory();
//	//创建bean定义读取器
//		BeanDefinitionReader reader = new XmlBeanDefinitionReader(register);
//
//		reader.loadBeanDefinitions("spring.xml");
//
//		System.out.println(Arrays.toString(register.getBeanDefinitionNames()));
//		System.out.println(register.getBeanDefinition("fox22"));
//
//		System.out.println(((DefaultListableBeanFactory) register).getBean("fox22"));


// 创建资源读取器
//DefaultResourceLoader resourceLoader = new DefaultResourceLoader();

// 装载Bean的定义

// 打印构建的Bean 名称
		//System.out.println(Arrays.toString(register.getBeanDefinitionNames());

// 工厂调用getBean方法
	//	System.out.println(register.getBean("user"));



	}
}
