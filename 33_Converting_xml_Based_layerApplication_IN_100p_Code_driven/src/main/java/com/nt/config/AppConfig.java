package com.nt.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "com.nt")
@ImportResource(locations = "com/nt/cfgs/applicationContext.xml")
@PropertySource(value = "com/nt/commons/info.properties")
public class AppConfig {

	@Autowired
	private Environment evn;
	
	@Bean(name="dmds")
	public DriverManagerDataSource createDMDS() {
		
		DriverManagerDataSource source=new DriverManagerDataSource();
		source.setDriverClassName(evn.getRequiredProperty("driver.class"));
		source.setUrl(evn.getRequiredProperty("driver.url"));
		source.setUsername(evn.getRequiredProperty("driver.username"));
		source.setPassword(evn.getRequiredProperty("driver.password"));
		
		return source;
	}
}
