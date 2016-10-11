package com.kpf.el;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.io.Resource;

import java.io.IOException;

/**
 * Created by 1 on 2016/10/10.
 */

@Configuration
@ComponentScan("com.kpf.el")
@PropertySource("classpath:test.properties")
public class Elconfig {
    @Value("I Love You")
    private String normal;

    @Value("#{systemProperties['os.name']}")
    private String osName;

    @Value("classpath:test.txt")
    private Resource testFile;

    @Value("#{demoService.another}")
    private String fromAnother;

    @Value("http://www.baidu.com")
    private Resource baiduUrl;

    @Value("${book.name}")
    private String bookName;


    public void outPutValue() {
        try {
            System.out.println(normal);
            System.out.println(osName);
            System.out.println(bookName);
            System.out.println(fromAnother);
            System.out.println(IOUtils.toString(testFile.getInputStream()));
            System.out.println(IOUtils.toString(baiduUrl.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
