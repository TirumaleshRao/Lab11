package com.jlc.springboot.Lab11;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@SpringBootApplication
public class JlcWebConfig {
@Bean
public ViewResolver viewResolver() {
	InternalResourceViewResolver resolver=new InternalResourceViewResolver();
	resolver.setPrefix("/WEB-INF/myjsps/");
	resolver.setSuffix(".JSP");
	resolver.setViewClass(JstlView.class);
	return resolver;
	
}
}
