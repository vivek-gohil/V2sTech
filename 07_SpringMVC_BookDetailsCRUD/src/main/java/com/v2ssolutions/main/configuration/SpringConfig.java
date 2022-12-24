package com.v2ssolutions.main.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.v2ssolutions.main.Interceptor.RequestProcessingTimeInterceptor;

@Configuration
public class SpringConfig implements WebMvcConfigurer {
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver bean = new InternalResourceViewResolver();
		bean.setPrefix("/WEB-INF/view/");
		bean.setSuffix(".jsp");

		return bean;
	}

	public void addInterceptors(InterceptorRegistry registry) {
		System.out.println("addInterceptors");
		registry.addInterceptor(new RequestProcessingTimeInterceptor());
	}

}