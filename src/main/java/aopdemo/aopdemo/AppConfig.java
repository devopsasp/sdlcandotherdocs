package aopdemo.aopdemo;

import org.springframework.aop.aspectj.annotation.AnnotationAwareAspectJAutoProxyCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public AnnotationAwareAspectJAutoProxyCreator getAOPBean()
	{
		return new AnnotationAwareAspectJAutoProxyCreator();
	}
 
}
