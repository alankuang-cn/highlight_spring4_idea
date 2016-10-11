package com.kpf.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by 1 on 2016/10/10.
 */
public class ElTest {


    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Elconfig.class);

        Elconfig source = context.getBean(Elconfig.class);

        source.outPutValue();

        context.close();
    }
}
