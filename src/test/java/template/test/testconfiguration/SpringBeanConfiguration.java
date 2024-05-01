package template.test.testconfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import template.test.testbeans.TestBean;
import template.test.testbeans.impl.TestBeanImpl;

/**
 * Configuration class for bean declaration. Same effect if this class is deleted and testBeans are annotated with {@link org.springframework.stereotype.Component}
 * @author romansen47
 */
@Configuration
public class SpringBeanConfiguration {

	/**
	 * For presentation purposes we create this bean within a configuration class. The other test bean will be created by {@link org.springframework.stereotype.Component} annotation.
	 * @return the test bean
	 */
	@Bean
	public TestBean testBean() {
		return new TestBeanImpl();
	}

}
