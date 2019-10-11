package com.jiagouedu.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: Fox
 * @Description:
 * @Author:
 * @Date: 2019/3/25 17:00
 * @Version: 1.0
 */

public class Fox {


	@Bean
	public User getUser(){
		return new User();
	}


}
