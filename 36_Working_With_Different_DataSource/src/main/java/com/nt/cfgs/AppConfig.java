package com.nt.cfgs;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {Controller_Config.class,Persistance_config.class,Service_Config.class})
public class AppConfig {

}
