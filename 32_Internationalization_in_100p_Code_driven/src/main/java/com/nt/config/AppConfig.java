package com.nt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration


public class AppConfig {

	@Bean("messageSource")
	
	public ResourceBundleMessageSource createRBMS() {
		
		ResourceBundleMessageSource source=new ResourceBundleMessageSource();
		source.setBasename("com/nt/commons/App");
				return source;
	}
}
