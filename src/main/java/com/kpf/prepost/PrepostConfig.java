package com.kpf.prepost;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by 1 on 2016/10/11.
 */
@Configuration
@ComponentScan("com.kpf.prepost")
public class PrepostConfig {

    @Bean(initMethod = "init",destroyMethod = "destory")
    BeanWayService beanWayService(){
        return new BeanWayService();
    }

    @Bean
    JSR350WayService jsr350WayService(){
        return new JSR350WayService();
    }
}
