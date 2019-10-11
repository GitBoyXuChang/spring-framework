package bat.ke.qq.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;



/**
 * 源码学院-Fox
 * 只为培养BAT程序员而生
 * http://bat.ke.qq.com
 * 往期视频加群:516212256 暗号:6
 */
public class UserService {


	public UserService(MyService myService) {
		System.out.println(myService);
		System.out.println("=====UserService======");
	}
}
