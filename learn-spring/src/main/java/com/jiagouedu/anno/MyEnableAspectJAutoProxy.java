package com.jiagouedu.anno;

import com.jiagouedu.config.MyProxyRegistrar;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * 源码学院-Fox
 * 只为培养BAT程序员而生
 * http://bat.ke.qq.com
 * 往期视频加群:516212256 暗号:6
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(MyProxyRegistrar.class)
public @interface MyEnableAspectJAutoProxy {

}
