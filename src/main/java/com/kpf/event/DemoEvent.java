package com.kpf.event;

import org.springframework.context.ApplicationEvent;

/**
 * Created by 1 on 2016/10/11.
 */
public class DemoEvent extends ApplicationEvent {

    private static final long serialVersionUID = -2880284071729228174L;

    private String MSG ;

    public DemoEvent(Object source,String msg) {
        super(source);
        this.MSG = msg;
    }

    public String getMSG() {
        return MSG;
    }

    public void setMSG(String MSG) {
        this.MSG = MSG;
    }
}
