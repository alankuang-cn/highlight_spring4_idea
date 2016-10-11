package com.kpf.profile;

import org.springframework.context.annotation.Bean;

import java.io.Serializable;

/**
 * Created by 1 on 2016/10/11.
 */
public class DemoBean implements  Serializable{

    private static final long serialVersionUID = 2749329155687664934L;

    private String content;

    public DemoBean(String content){
        super();
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
