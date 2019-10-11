package bat.ke.qq.com.config;

import bat.ke.qq.com.bean.Fox;
import bat.ke.qq.com.bean.MyImportBeanDefinitionRegistrar;
import bat.ke.qq.com.bean.MyImportSelector;
import bat.ke.qq.com.bean.User;
import org.springframework.context.annotation.*;

import java.util.HashMap;

/**
 * 源码学院-Fox
 * 只为培养BAT程序员而生
 * http://bat.ke.qq.com
 * 往期视频加群:516212256 暗号:6
 */
@ComponentScan("bat.ke.qq.com")
@Configuration
//@Import(value = MyImportBeanDefinitionRegistrar.class)
public class AppConfig {

	@Bean
	public User user(){
		return new User();
	}

//	@Bean
//	public Fox fox(){
//		//System.out.println(user());
//		//System.out.println("fox()");
//		return new Fox();
//	}



}
