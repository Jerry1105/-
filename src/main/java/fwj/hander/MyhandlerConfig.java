package fwj.hander;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/*
fuwenjie



*/
@Configuration
public class MyhandlerConfig extends WebMvcConfigurerAdapter {

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		System.out.println("*************&&&&&&&&&&*&*&*&*");
		registry.addInterceptor(new Myhander()).addPathPatterns("/user/**");
		super.addInterceptors(registry);
	}

}
