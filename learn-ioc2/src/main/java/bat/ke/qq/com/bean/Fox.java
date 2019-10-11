package bat.ke.qq.com.bean;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * 源码学院-Fox
 * 只为培养BAT程序员而生
 * http://bat.ke.qq.com
 * 往期视频加群:516212256 暗号:6
 */
public class Fox {

	private String name;
	private int age;

	@Autowired
	private User user;

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

	@Override
	public String toString() {
		return "Fox{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
