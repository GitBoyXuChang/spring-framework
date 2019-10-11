package bat.ke.qq.com.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 源码学院-Fox
 * 只为培养BAT程序员而生
 * http://bat.ke.qq.com
 * 往期视频加群:516212256 暗号:6
 */
@Configuration
@ComponentScan("bat.ke.qq.com")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AppConfig {


}
