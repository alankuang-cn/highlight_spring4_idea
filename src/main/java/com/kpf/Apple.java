package com.kpf;

/**
 * Created by 1 on 2016/10/11.
 */
public class Apple {

    @FruitName(value = {"apple","pineapple"})
    private String [] name;

    public Apple(){
    }

    public String[] getName() {
        return name;
    }

    public void setName(String[] name) {
        this.name = name;
    }
}
