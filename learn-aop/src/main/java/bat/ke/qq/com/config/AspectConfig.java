package bat.ke.qq.com.config;

import com.sun.corba.se.impl.ior.OldJIDLObjectKeyTemplate;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 源码学院-Fox
 * 只为培养BAT程序员而生
 * http://bat.ke.qq.com
 * 往期视频加群:516212256 暗号:6
 */
@Aspect
@Component
public class AspectConfig {

	//@Pointcut("execution(* bat.ke.qq.com.dao.*.*(..))")
	//@Pointcut("within(bat.ke.qq.com.dao.*)")
	//@Pointcut("args(String)")
	//@Pointcut("this(bat.ke.qq.com.dao.FoxDao)")   // jdk动态代理 extend Proxy implements IFoxDao
	//@Pointcut("target(bat.ke.qq.com.dao.FoxDao)")
	//@Pointcut("args(String ...) || args()")
	//@Pointcut("execution(* bat.ke.qq.com.dao.*.*(String))")
	//@Pointcut("@annotation(bat.ke.qq.com.anno.Yuanma)")
	//@Pointcut("@target(bat.ke.qq.com.anno.Dao)")  // 目标是注解配置
	//@Pointcut("@within(bat.ke.qq.com.anno.Dao)")
	//@Pointcut("@args(bat.ke.qq.com.anno.Dao)") //传参类型配置@Dao的类型
	@Pointcut("bean(foxDao)")
	private void pointcut() {

	}


	@Before("pointcut()")
	public void before(JoinPoint point) {
		point.getThis();
		System.out.println("before");
	}

	@After("pointcut()")
	public void after() {
		System.out.println("after");
	}

	@AfterReturning("pointcut()")
	public void afterReturning() {
		System.out.println("afterReturning");
	}

	@AfterThrowing("pointcut()")
	public void afterThrwoing() {
		System.out.println("afterThrwoing");
	}

	@Around("pointcut()")
	public Object around(ProceedingJoinPoint point) throws Throwable {
		System.out.println("around");
		Object[] args = point.getArgs();
		for(int i=0;i<args.length;i++){
			System.out.println("====args:"+args[i]);
			if(args[i].getClass().equals(String.class)){
				args[i] += "xxxx";
			}
		}
		Object result = point.proceed(args);

		return result;
	}


}
