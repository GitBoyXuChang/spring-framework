package com.mvc.config;

import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import com.alibaba.fastjson.support.spring.messaging.MappingFastJsonMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import java.util.List;

/**
 * 源码学院-Fox
 * 只为培养BAT程序员而生
 * http://bat.ke.qq.com
 * 往期视频加群:516212256 暗号:6
 */

@Configuration
@ComponentScan(value = "com.mvc.controller")
@EnableWebMvc
public class AppConfig implements WebMvcConfigurer {

	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {

		converters.add(new FastJsonHttpMessageConverter());
	}

	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		registry.jsp("/page/",".jsp");
	}
}
