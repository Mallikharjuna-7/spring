package com.xworkz.tshirt.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class TshirtWebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {

		return new Class[] { TshirtConfiguration.class };
	}

	@Override
	protected String[] getServletMappings() {

		return new String[] { "/" };
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}

}
