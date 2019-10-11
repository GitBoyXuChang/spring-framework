package bat.ke.qq.com.config;

import bat.ke.qq.com.bean.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;

/**
 * 源码学院-Fox
 * 只为培养BAT程序员而生
 * http://bat.ke.qq.com
 * 往期视频加群:516212256 暗号:6
 */
@ComponentScan("bat.ke.qq.com")
@Configuration
//@Import(AppConfig2.class)
//@Import(value = {MyImportBeanDefinitionRegistrar.class,MyImportSelector.class})
public class AppConfig {

	/*@Bean
	public User user(){
		return new User();
	}*/

	@Bean(initMethod="initxml",destroyMethod = "destroyxml")
	public Fox fox(){
		return new Fox();
	}
}
