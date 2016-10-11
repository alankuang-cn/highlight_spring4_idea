package com.kpf;

import java.lang.annotation.*;

/**
 * Created by 1 on 2016/10/11.
 */
@Target(ElementType.FIELD)
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface FruitName {

    String [] value() default "" ;
}
