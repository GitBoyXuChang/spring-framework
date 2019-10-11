package bat.ke.qq.com.bean;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
   @Override
   public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
   		// bean --- beanDefiniton
	   // BeanDefinitionRegistry bean定义的注册器   id--- beanName   map  beanName---beanDefiniton
      //创建BeanDefinition
      RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(Fox.class);
      // 注册到容器     fox--- rootBeanDefinition
      registry.registerBeanDefinition("fox",rootBeanDefinition);

      // 1  byName   setCat
	   // 2 byType     传参

      rootBeanDefinition.setAutowireMode(3);
   }
}