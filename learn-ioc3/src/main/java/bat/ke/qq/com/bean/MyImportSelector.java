package bat.ke.qq.com.bean;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * 源码学院-Fox
 * 只为培养BAT程序员而生
 * http://bat.ke.qq.com
 * 往期视频加群:516212256 暗号:6
 */
public class MyImportSelector implements ImportSelector {
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		//  支持byType
		return new String[]{Fox.class.getName()};
}
}
