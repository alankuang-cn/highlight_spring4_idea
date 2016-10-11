package com.kpf.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by 1 on 2016/10/10.
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.kpf.aop")
public class AopConfig {
}
