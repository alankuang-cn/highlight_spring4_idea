package com.kpf.prepost;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by 1 on 2016/10/11.
 */
public class PrepostTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrepostConfig.class);

        context.close();
    }
}
