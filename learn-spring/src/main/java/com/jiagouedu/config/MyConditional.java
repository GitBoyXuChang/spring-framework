package com.jiagouedu.config;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.Conditional;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;

/**
 * @ClassName: MyConditional
 * @Description:
 * @Author: Fox
 * @Date: 2019/4/1 19:31
 * @Version: 1.0
 */

public class MyConditional implements Condition {

	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		if(context.getBeanFactory().containsBean("cat"))
			return true;
		return false;
	}
}
