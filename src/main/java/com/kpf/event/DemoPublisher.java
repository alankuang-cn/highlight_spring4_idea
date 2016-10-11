package com.kpf.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

/**
 * Created by 1 on 2016/10/11.
 */
@Component
public class DemoPublisher {

    @Autowired
    private ApplicationContext applicationContext;

    public void publisher(String msg){
        applicationContext.publishEvent(new DemoEvent(this,msg));
    }
}
