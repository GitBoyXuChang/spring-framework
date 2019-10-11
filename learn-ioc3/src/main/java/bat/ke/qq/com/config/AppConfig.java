package bat.ke.qq.com.config;

import bat.ke.qq.com.bean.*;
import bat.ke.qq.com.service.MyService;
import bat.ke.qq.com.service.UserService;
import org.springframework.context.annotation.*;

@ComponentScan("bat.ke.qq.com")
@Configuration  //  AppConfig  ---- AppConfig@EnchancerByCglib
@Import({MyImportBeanDefinitionRegistrar.class,MyImportSelector.class})
@ImportResource("spring.xml")
public class AppConfig {

	@Bean
	public Cat cat(){
		return new Cat();
	}

	@Bean
	public Tiger tiger(){
		return new Tiger();
	}


	@Bean
	@Conditional(value = MyConditional.class)
	public Fox fox(){
		return new Fox();
	}

    @Bean  // method bean  beanName
    public MyService myService() {
        return new MyService();
    }
//
    @Bean
    public UserService userService(){
		return new UserService(myService());
	}
}