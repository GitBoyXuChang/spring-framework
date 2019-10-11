package bat.ke.qq.com.bean;

import bat.ke.qq.com.service.MyService;

/**
 * 源码学院-Fox
 * 只为培养BAT程序员而生
 * http://bat.ke.qq.com
 * 往期视频加群:516212256 暗号:6
 */
public class Monkey {

	private String name;

	private Fox fox;


	private Monkey(){
		System.out.println("======Monkey======");
	}

	public Monkey(String name) {
		System.out.println("======Monkey(String name)======");
		this.name = name;
	}

//	public  Monkey(Fox fox){
//		System.out.println("======Monkey(Fox fox)======");
//		this.fox = fox;
//	}
//
//	public Monkey(Cat cat,Tiger tiger) {
//		System.out.println(cat+"===Monkey(Cat cat,Tiger tiger)=====");
//	}
//
//	public Monkey(Cat cat, User user) {
//		System.out.println(cat+"=== Monkey(Cat cat, User user) =====");
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Monkey{" +
				"name='" + name + '\'' +
				'}';
	}
}
