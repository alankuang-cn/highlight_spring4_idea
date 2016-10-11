package com.kpf.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by 1 on 2016/10/11.
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {

    public void onApplicationEvent(DemoEvent demoEvent) {
        String msg = demoEvent .getMSG();

        System.out.println("我(bean-demoListener) 接收到了 bean -demoPublisher发布的信息 :" +msg);
    }


}
