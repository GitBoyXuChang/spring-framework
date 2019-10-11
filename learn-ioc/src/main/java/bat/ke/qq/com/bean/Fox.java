package bat.ke.qq.com.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * 源码学院-Fox
 * 只为培养BAT程序员而生
 * http://bat.ke.qq.com
 * 往期视频加群:516212256 暗号:6
 */
public class Fox implements InitializingBean,DisposableBean {
	public Fox(){
		System.out.println("Constructor===fox===");
	}

	@PostConstruct
	public void init(){
		System.out.println("@PostConstruct==init==");
	}

	@PostConstruct
	public void init2(){
		System.out.println("@PostConstruct==init2==");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean==afterPropertiesSet==");
	}

	public void initxml(){
		System.out.println("xml==initxml==");
	}

	@PreDestroy
	public void preDestroy(){
		System.out.println("@PreDestroy==preDestroy==");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("DisposableBean==destroy==");
	}

	public void destroyxml(){
		System.out.println("xml==destroyxml==");
	}

}
