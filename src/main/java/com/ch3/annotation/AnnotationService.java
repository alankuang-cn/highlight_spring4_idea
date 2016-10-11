package com.ch3.annotation;

import org.springframework.stereotype.Service;

/**
 * Created by 1 on 2016/10/11.
 */

@Service
public class AnnotationService {

    public void outPutResult(){
        System.out.println("从组合注解的配置照样活得的bean");
    }
}
