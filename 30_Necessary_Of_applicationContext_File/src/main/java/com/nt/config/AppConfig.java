package com.nt.config;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages = "com.nt")
@ImportResource(locations = "com/nt/cfgs/applicationContext.xml")
public class AppConfig {

	public AppConfig() {
		System.out.println("AppConfig:: 0 param constructor");
	}
	
	
	
	
}
