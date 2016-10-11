package com.kpf.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by 1 on 2016/10/11.
 */
@Configuration
@ComponentScan("com.kpf.profile")
public class ProfileBeanConfig {

    @Bean
    @Profile("dev")
    DemoBean demoBean1(){
        return  new DemoBean("this is dev profile");
    }

    @Bean
    @Profile("prod")
    DemoBean demoBean2(){
        return new DemoBean("this is prod profile");
    }
}
