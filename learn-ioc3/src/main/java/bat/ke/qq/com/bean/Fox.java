package bat.ke.qq.com.bean;

import bat.ke.qq.com.service.MyService;
import org.springframework.stereotype.Component;

/**
 * 源码学院-Fox
 * 只为培养BAT程序员而生
 * http://bat.ke.qq.com
 * 往期视频加群:516212256 暗号:6
 */

public class Fox {

	private Cat cat;

	public Fox() {
	}

	public Fox(Cat cat) {
		System.out.println(cat+"===Fox(Cat cat)=====");
	}

	public Fox(Cat cat,Tiger tiger) {
		System.out.println(cat+"===Fox(Cat cat,Tiger tiger)=====");
	}
//
	public Fox(Cat cat, MyService myService) {
		System.out.println(cat+"=== Fox(Cat cat, MyService myService) =====");
	}

	public Cat getCat() {
		return cat;
	}


	public void setCat(Cat cat) {
		System.out.println(cat+"======setCat(Cat cat)");
		this.cat = cat;
	}

	@Override
	public String toString() {
		return "Fox{" +
				"cat=" + cat +
				'}';
	}

	//	public Fox(User user,Cat cat) {
//		System.out.println(user+"===Fox(User user,Cat cat) =====");
//	}
}
