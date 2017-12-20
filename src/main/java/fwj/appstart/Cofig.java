package fwj.appstart;
/*
fuwenjie



*/

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;

@Configuration
public class Cofig {

	public Runnable create() {

		return () -> {
		};
	}

	//
	@Bean
	public MethodValidationPostProcessor methodValidationPostProcessor() {
		return new MethodValidationPostProcessor();
	}

	// @Bean
	// public EmbeddedServletContainerCustomizer containerCustomizer() {
	//
	// return new EmbeddedServletContainerCustomizer() {
	// @Override
	// public void customize(ConfigurableEmbeddedServletContainer container) {
	// ErrorPage error401Page = new ErrorPage(HttpStatus.UNAUTHORIZED,
	// "/401.html");
	// ErrorPage error404Page = new ErrorPage(HttpStatus.NOT_FOUND,
	// "/404.html");
	// ErrorPage error500Page = new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR,
	// "/500.html");
	// container.addErrorPages(error401Page, error404Page, error500Page);
	// }
	// };
	// }
}
