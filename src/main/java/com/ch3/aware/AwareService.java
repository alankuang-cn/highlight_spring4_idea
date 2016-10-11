package com.ch3.aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * Created by 1 on 2016/10/11.
 */
@Service
public class AwareService implements BeanNameAware,ResourceLoaderAware{

    private String name;
    private ResourceLoader resourceLoader;
    public void setBeanName(String s) {
        this.name = s;
    }

    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    public void outPutResult(){
        System.out.println("Bean 的名称为 ：" + name);

        Resource resource = resourceLoader.getResource("classpath:aware_test.txt");

        try {
            System.out.println(IOUtils.toString(resource.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
