import bat.ke.qq.com.bean.Fox;
import bat.ke.qq.com.config.AppConfig;
import bat.ke.qq.com.dao.FoxDao;
import bat.ke.qq.com.dao.IFoxDao;
import bat.ke.qq.com.proxy.MyInvocationHandler;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.Proxy;

/**
 * 源码学院-Fox
 * 只为培养BAT程序员而生
 * http://bat.ke.qq.com
 * 往期视频加群:516212256 暗号:6
 */
public class AopTest {

	@Test
	public void test(){
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		IFoxDao dao = (IFoxDao) context.getBean(FoxDao.class);
		dao.query();
		dao.query("fox");
		dao.query(new Fox());

//		IFoxDao dao = (IFoxDao) Proxy.newProxyInstance(AopTest.class.getClassLoader(),
//				new Class[]{IFoxDao.class},new MyInvocationHandler(new FoxDao()));
//		dao.query();




	}


}
