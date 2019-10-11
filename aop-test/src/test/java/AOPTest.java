import bat.ke.qq.com.config.AppConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 源码学院-Fox
 * 只为培养BAT程序员而生
 * http://bat.ke.qq.com
 * 往期视频加群:516212256 暗号:6
 */
public class AOPTest {
	@Test
	public void test(){
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	}
}
