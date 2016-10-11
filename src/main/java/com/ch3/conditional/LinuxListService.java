package com.ch3.conditional;

/**
 * Created by 1 on 2016/10/11.
 */
public class LinuxListService implements  ListService {
    public String showListCmd() {
        return "dir";
    }
}
