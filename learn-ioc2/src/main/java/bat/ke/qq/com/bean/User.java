package bat.ke.qq.com.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * 源码学院-Fox
 * 只为培养BAT程序员而生
 * http://bat.ke.qq.com
 * 往期视频加群:516212256 暗号:6
 */


public class User {


	public User(){
		System.out.println("调用User()构造器");
	}


	@PostConstruct
	public void init(){

		System.out.println("@PostConstruct==init==");

	}


}
