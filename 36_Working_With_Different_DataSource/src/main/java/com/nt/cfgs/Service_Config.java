package com.nt.cfgs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.nt.service")
@PropertySource(value = "com/nt/commons/jdbcinfo.properties")
public class Service_Config {

}
