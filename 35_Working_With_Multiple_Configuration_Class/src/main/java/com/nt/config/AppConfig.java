package com.nt.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ServiceConfig.class,ControllerConfig.class,PersistanceConfig.class})
public class AppConfig {

}
