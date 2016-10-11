package com.kpf.aop;

import java.lang.annotation.*;

/**
 * Created by 1 on 2016/10/10.
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
