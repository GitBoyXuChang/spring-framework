package bat.ke.qq.com.dao;

import bat.ke.qq.com.anno.Dao;
import bat.ke.qq.com.anno.Yuanma;
import bat.ke.qq.com.bean.Fox;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.lang.annotation.Target;

/**
 * 源码学院-Fox
 * 只为培养BAT程序员而生
 * http://bat.ke.qq.com
 * 往期视频加群:516212256 暗号:6
 */
@Component
@Lazy
public class FoxDao implements IFoxDao{


	//@Yuanma
	public void query(){
		System.out.println("===query==");
		//int i = 1/0;
	}

	public void query(String name){
		System.out.println("===query(String name)=="+name);
		//int i = 1/0;
	}



	public void query(String name,String sex){
		System.out.println("===query(String name,String sex)=="+name+sex);
		//int i = 1/0;
	}

	public void query(Fox fox){
		System.out.println("===query(FoxDao dao)=="+fox);
		//int i = 1/0;
	}
}
