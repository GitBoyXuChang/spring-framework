package com.jiagouedu.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 源码学院-Fox
 * 只为培养BAT程序员而生
 * http://bat.ke.qq.com
 * 往期视频加群:516212256 暗号:6
 */
@Component
public  class A {
	@Autowired
	private B b;
	public A(){

	}
	public A(B b){
		this.b = b;
	}
}
