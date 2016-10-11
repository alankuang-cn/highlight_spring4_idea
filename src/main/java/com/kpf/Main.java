package com.kpf;

import com.kpf.aop.AopConfig;
import com.kpf.aop.DemoAnnotationService;
import com.kpf.aop.DemoMethodService;
import com.kpf.service.UserFunctionService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Properties;

/**
 * Created by 1 on 2016/10/10.
 */
public class Main {


    public static void main(String[] args) {

       Properties properties =  System.getProperties();

        for (int i = 0; i <properties.size() ; i++) {
        }

        System.out.println(properties.size());

    }
}
