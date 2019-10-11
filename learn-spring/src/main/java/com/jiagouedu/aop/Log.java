package com.jiagouedu.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


/**
 * 源码学院-Fox
 * 只为培养BAT程序员而生
 * http://bat.ke.qq.com
 * 往期视频加群:516212256 暗号:6
 */
@Aspect
@Component
public class Log {


	@Pointcut("execution(* com.jiagouedu.service.*.*(..))")
	public void inWebLayer() {
		System.out.println("=======inWebLayer=====");
	}

	@Before("execution(* com.jiagouedu.service.*.*(..))")
	public void doAccessCheck() {
		System.out.println("=======doAccessCheck=====");
	}

}
