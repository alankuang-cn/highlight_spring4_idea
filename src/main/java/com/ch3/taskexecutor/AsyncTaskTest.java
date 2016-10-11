package com.ch3.taskexecutor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by 1 on 2016/10/11.
 */
public class AsyncTaskTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExcutorConfig.class);
        AsyncTaskService service = context.getBean(AsyncTaskService.class);
        for (int i = 0; i < 10 ; i++) {
            service.executeAsyncTask(i);
            service.executeAsyncTaskPlus(i);
        }

        context.close();

    }
}
