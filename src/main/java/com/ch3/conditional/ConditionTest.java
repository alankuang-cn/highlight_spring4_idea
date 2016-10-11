package com.ch3.conditional;


import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by 1 on 2016/10/11.
 */
public class ConditionTest {

    public static void main(String[] args) {
        //System.setProperty("os.name","ad");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);
        try {
            ListService service = context.getBean(ListService.class);
            System.out.println("你的操作系统是 ：" + context.getEnvironment().getProperty("os.name"));
            System.out.println("对应的命令为 ："+ service.showListCmd());
        }catch (NoSuchBeanDefinitionException e){
            e.printStackTrace();
            System.out.println("Cannot found this bean and programmer will exit ");
        }finally {
            context.close();
        }






    }
}
