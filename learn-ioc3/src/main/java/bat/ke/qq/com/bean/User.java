package bat.ke.qq.com.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 源码学院-Fox
 * 只为培养BAT程序员而生
 * http://bat.ke.qq.com
 * 往期视频加群:516212256 暗号:6
 */
@Component
public class User {

	@Autowired
	private Fox fox;


	public User() {

		System.out.println("=====user====");
	}


	public Fox getFox() {
		return fox;
	}
//
	public void setFox(Fox fox) {
		System.out.println(fox+"=============");
		this.fox = fox;
	}
}
