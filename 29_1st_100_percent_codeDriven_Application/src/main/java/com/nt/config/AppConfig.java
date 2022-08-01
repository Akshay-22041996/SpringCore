package com.nt.config;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value =  "com.nt")
public class AppConfig {
	
	
	public AppConfig() {
		System.out.println("AppConfig :: 0 param constructor");
	}

	@Bean("ldt")
	public LocalDateTime createLocalDateTime() {
		System.out.println("CreatelocaldateTime method is executed");
		return LocalDateTime.now();
	}
}
