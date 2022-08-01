package com.nt.config;

import java.sql.DriverManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "com.nt.dao")
@PropertySource(value = "com/nt/commons/info.properties")
public class PersistanceConfig {
	
	@Autowired
	private Environment evn;
	
	@Bean(name="dmconfigclass")
	public DriverManagerDataSource createDM() {
		DriverManagerDataSource dmds=new DriverManagerDataSource();
		dmds.setDriverClassName(evn.getRequiredProperty("jdbc.driver"));
		dmds.setUrl(evn.getRequiredProperty("jdbc.url"));
		dmds.setUsername(evn.getRequiredProperty("jdbc.username"));
		dmds.setPassword(evn.getRequiredProperty("jdbc.password"));
		
		return dmds;
		
	}

}
