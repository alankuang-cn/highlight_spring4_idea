package com.kpf.prepost;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by 1 on 2016/10/11.
 */
public class JSR350WayService {

    @PostConstruct
    public void init(){
        System.out.println("jsr350-init-method");
    }

    public JSR350WayService(){
        System.out.println("初始化构造函数 -JSR350WayService");
    }

    @PreDestroy
    public void destory(){
        System.out.println("jsr350-destory-method");
    }
}
