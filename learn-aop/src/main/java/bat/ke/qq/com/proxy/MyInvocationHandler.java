package bat.ke.qq.com.proxy;

import bat.ke.qq.com.dao.FoxDao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 源码学院-Fox
 * 只为培养BAT程序员而生
 * http://bat.ke.qq.com
 * 往期视频加群:516212256 暗号:6
 */
public class MyInvocationHandler implements InvocationHandler {
	private Object obj;

	public MyInvocationHandler(Object obj) {
		this.obj = obj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		System.out.println("==jdk==");

		return method.invoke(obj,args);
	}
}
