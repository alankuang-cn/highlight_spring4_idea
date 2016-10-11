package com.kpf;

import com.kpf.aop.AopConfig;
import com.kpf.aop.DemoAnnotationService;
import com.kpf.aop.DemoMethodService;
import com.kpf.service.UserFunctionService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.Field;
import java.util.Properties;

/**
 * Created by 1 on 2016/10/10.
 */
public class Main {


    public static void main(String[] args) {

        try {
            Class<?> cls = Class.forName("com.kpf.Apple");
            Field [] fild = cls.getDeclaredFields();
            for (Field f : fild){
                if(f.isAnnotationPresent(FruitName.class)){
                    FruitName name = f.getAnnotation(FruitName.class);
                    for (String s : name.value()){
                        System.out.println(s);
                    }
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
