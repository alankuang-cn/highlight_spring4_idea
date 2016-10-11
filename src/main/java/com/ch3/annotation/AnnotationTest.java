package com.ch3.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by 1 on 2016/10/11.
 */
public class AnnotationTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context  = new AnnotationConfigApplicationContext(AnnotationConfig.class);

        AnnotationService service = context.getBean(AnnotationService.class);

        service.outPutResult();

        context.close();
    }
}
