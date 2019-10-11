package com.mvc.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * 源码学院-Fox
 * 只为培养BAT程序员而生
 * http://bat.ke.qq.com
 * 往期视频加群:516212256 暗号:6
 */
public class MyWebApplicationInitializer implements WebApplicationInitializer {
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		// Load Spring web application configuration
		AnnotationConfigWebApplicationContext ac = new AnnotationConfigWebApplicationContext();
		ac.register(AppConfig.class);
		//ac.refresh();

		// Create and register the DispatcherServlet
		DispatcherServlet servlet = new DispatcherServlet(ac);
		ServletRegistration.Dynamic registration = servletContext.addServlet("app", servlet);
		//web容器启动的时候执行servlet的init()方法   ioc容器
		registration.setLoadOnStartup(1);
		registration.addMapping("*.do");
	}
}
