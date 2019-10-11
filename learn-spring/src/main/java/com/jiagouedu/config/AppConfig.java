package com.jiagouedu.config;

import com.jiagouedu.anno.MyEnableAspectJAutoProxy;
import com.jiagouedu.bean.Cat;
import com.jiagouedu.bean.Fox;
import com.jiagouedu.bean.User;
import com.jiagouedu.service.UserService;
import com.jiagouedu.service.UserServiceImpl;
import org.springframework.context.annotation.*;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @ClassName: BeanLifeCycle
 * @Description:
 * @Author:
 * @Date: 2019/3/24 19:21
 * @Version: 1.0
 */
@ComponentScan("com.jiagouedu")
@Configuration
//@EnableAspectJAutoProxy
@MyEnableAspectJAutoProxy
//@Import(value = {MyImportBeanDefinitionRegistrar.class,MyImportSelector.class})
public class AppConfig {

//	@Bean
//	public User user(){
//		System.out.println("------return user -----");
//		return new User();
//	}

//	@Bean
//	public UserService userServiceImpl(){
//		return new UserServiceImpl();
//	}

	@Bean
	public Cat cat(){
		return new Cat();
	}

	@Bean
	@Conditional(value = MyConditional.class)
	public Fox fox(){
		return new Fox();
	}

}
