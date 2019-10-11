package com.jiagouedu.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.SmartInitializingSingleton;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @ClassName: User
 * @Description:
 * @Author:
 * @Date: 2019/3/24 19:14
 * @Version: 1.0
 */
@Component
public class User implements InitializingBean, DisposableBean, SmartInitializingSingleton {


	public User(){
		System.out.println("-------User Constractor------");
	}

	public User(Cat cat){
		System.out.println("========="+cat+"=======constructor 注入");
	}

	public void setUserxxxx(Cat cat){
		System.out.println("========="+cat+"=======setUserxxxx 注入");
	}

	public void setUser(Cat cat){
		System.out.println("========="+cat+"=======setUser 注入");
	}

	String name;
	int age;



	@Override
	public void destroy() throws Exception {
		System.out.println("-------User destory--------");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("-------User afterPropertiesSet-------");
	}


	@Override
	public void afterSingletonsInstantiated() {
		System.out.println("------User afterSingletonsInstantiated--------");
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("========="+name);
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
