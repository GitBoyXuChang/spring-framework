package com.mvc;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

/**
 * 源码学院-Fox
 * 只为培养BAT程序员而生
 * http://bat.ke.qq.com
 * 往期视频加群:516212256 暗号:6
 */
public class SpringApplication {
	public static void run() throws  Exception {
		Tomcat tomcat = new Tomcat();
		tomcat.setPort(8088);
		// 告诉tomcat  web项目
		tomcat.addWebapp("/","D:\\code\\java_learn\\spring-framework\\web");

		tomcat.start();

		tomcat.getServer().await();
		//Thread.currentThread().join();
	}




}
