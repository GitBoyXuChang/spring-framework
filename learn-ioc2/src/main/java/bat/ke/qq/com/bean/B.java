package bat.ke.qq.com.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 源码学院-Fox
 * 只为培养BAT程序员而生
 * http://bat.ke.qq.com
 * 往期视频加群:516212256 暗号:6
 */
@Component
public class B {
	@Autowired
	private A a;

	public B(){
		System.out.println("调用了构造器B()");
	}


	public B(A a){
		System.out.println("调用了构造器B(A a)");
		this.a = a;
	}

	public A getA() {
		return a;
	}

	public void setA(A a) {
		System.out.println("调用了setA(A a)");
		this.a = a;
	}

//	@Override
//	public String toString() {
//		return "B{" +
//				"a=" + a +
//				'}';
//	}
}
