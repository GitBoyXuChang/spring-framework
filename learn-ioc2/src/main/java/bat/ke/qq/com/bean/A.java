package bat.ke.qq.com.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 源码学院-Fox
 * 只为培养BAT程序员而生
 * http://bat.ke.qq.com
 * 往期视频加群:516212256 暗号:6
 */
@Component
public class A {
	@Autowired
	private B b;

	public A(){
		System.out.println("调用了构造器A()");
	}

	public A(B b){
		System.out.println("调用了构造器A(B b)");
		this.b = b;
	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		System.out.println("调用了setB(B b)");
		this.b = b;
	}

	@Override
	public String toString() {
		return "A{" +
				"b=" + b +
				'}';
	}
}
