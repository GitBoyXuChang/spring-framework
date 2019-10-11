package bat.ke.qq.com.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.util.concurrent.locks.Lock;

/**
 * 源码学院-Fox
 * 只为培养BAT程序员而生
 * http://bat.ke.qq.com
 * 往期视频加群:516212256 暗号:6
 */
@Component
public class A {

	private String name;
	private int age;


	@Autowired
	private B b;

	public A(){}


	public A(B b){

	}

	public void setB(B b) {
		this.b = b;
	}

	public String getName() {

		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
