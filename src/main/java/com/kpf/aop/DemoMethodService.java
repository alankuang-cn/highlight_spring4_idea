package com.kpf.aop;

import org.springframework.stereotype.Service;

/**
 * Created by 1 on 2016/10/10.
 */
@Service
public class DemoMethodService {


    public void add(){

        System.out.println(this.getClass().getSimpleName());
    }
}
