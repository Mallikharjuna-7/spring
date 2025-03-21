package com.xworkz.autospare.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz")
public class AutoSpareConfiguration {
	
	
	public AutoSpareConfiguration() {
		System.out.println("AutoSpare Configuration");
	}
	
	
	@Bean
	public ViewResolver getViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setSuffix(".jsp");
		return resolver;
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean getGameManager() {
		return new LocalContainerEntityManagerFactoryBean();
	}

	@Bean
    public CommonsMultipartResolver multipartResolver() {
        CommonsMultipartResolver resolver = new CommonsMultipartResolver();
        resolver.setMaxUploadSize(5242880); // 5MB max file size
        resolver.setMaxInMemorySize(1024); // 1KB max in-memory size
        return resolver;
    }
}
