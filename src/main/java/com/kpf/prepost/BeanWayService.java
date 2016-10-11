package com.kpf.prepost;

/**
 * Created by 1 on 2016/10/11.
 */


public class BeanWayService {


    public void init(){

        System.out.println("@bean-init-method");
    }

    public BeanWayService(){
        super();
        System.out.println("初始化构造函数-BeanWayService");
    }

    public void destory(){
        System.out.println("@Bean-destory-method");
    }
}
