package bat.ke.qq.com.bean;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * 源码学院-Fox
 * 只为培养BAT程序员而生
 * http://bat.ke.qq.com
 * 往期视频加群:516212256 暗号:6
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata,
										BeanDefinitionRegistry registry) {
		//创建BeanDefinition
		RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(Fox.class);
		// 注册到容器
		registry.registerBeanDefinition("fox",rootBeanDefinition);
	}
}
