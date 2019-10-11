package com.jiagouedu.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @ClassName: MyImportSelector
 * @Description:
 * @Author:
 * @Date: 2019/3/26 12:54
 * @Version: 1.0
 */
public class MyImportSelector implements ImportSelector {
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[]{"com.jiagouedu.bean.Cat"};
	}
}
