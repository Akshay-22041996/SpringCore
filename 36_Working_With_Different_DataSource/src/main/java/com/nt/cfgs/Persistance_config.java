package com.nt.cfgs;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan(basePackages = "com.nt.dao")
@PropertySource(value = "com/nt/commons/jdbcinfo.properties")
public class Persistance_config {

	@Autowired
	private Environment env;
	
	/** 1st DataSource object it is build in Connection pool but not recommonded to use
	 * 
	
	@Bean
	public DataSource createDataSource() {
		
		DriverManagerDataSource dmds=new DriverManagerDataSource();
		dmds.setDriverClassName(env.getRequiredProperty("jdbc.driver"));
		dmds.setUrl(env.getRequiredProperty("jdbc.url"));
		dmds.setUsername(env.getRequiredProperty("jdbc.username"));
		dmds.setPassword(env.getRequiredProperty("jdbc.password"));
		return dmds;
	}
	
	 */
	
	@Bean
	public DataSource createDataSource() {
		HikariDataSource dmds=new HikariDataSource();
		dmds.setDriverClassName(env.getRequiredProperty("jdbc.driver"));
		dmds.setJdbcUrl(env.getRequiredProperty("jdbc.url"));
		dmds.setUsername(env.getRequiredProperty("jdbc.username"));
		dmds.setPassword(env.getRequiredProperty("jdbc.password"));
		System.out.println("Hikari Connection pool is executed");
		return dmds;
	}
}
