package template.annotation.initializer.impl;

import org.springframework.context.annotation.ComponentScan;

import template.annotation.initializer.SpringAnnotationContextInitializer;

/**
 * Concrete implementation of the annotation context initializer.
 * 
 * Root package is template, only sub-packages are scanned for bean definition pick up.
 * @author romansen47
 */
@ComponentScan(basePackages = SpringAnnotationContextInitializerImpl.BASE_PACKAGES)
public class SpringAnnotationContextInitializerImpl extends SpringAnnotationContextInitializer {

	public static final String BASE_PACKAGES = "template..*";

	@Override
	public String getBasePackages() {
		return SpringAnnotationContextInitializerImpl.BASE_PACKAGES;
	}

}
