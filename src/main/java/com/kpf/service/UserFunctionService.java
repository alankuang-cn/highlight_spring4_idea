package com.kpf.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 1 on 2016/10/10.
 */
@Service
public class UserFunctionService {

    @Autowired
    FunctionService functionService;

    public String sayHello(){

        return functionService.sayHello();
    }
}
