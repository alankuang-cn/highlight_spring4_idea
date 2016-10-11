package com.kpf.aop;

import org.springframework.stereotype.Service;

/**
 * Created by 1 on 2016/10/10.
 */
@Service
public class DemoAnnotationService {
    @Action(name="使用注解的add操作")
    public void addd(){
        System.out.println("add  for "+this.getClass().getSimpleName() );
    }
}
