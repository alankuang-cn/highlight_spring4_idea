package com.ch3.taskscheduler;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * Created by 1 on 2016/10/11.
 */
public class TaskSchedulerTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskSchedulerConfig.class);
        ScheduledTaskService scheduledTaskService = context.getBean(ScheduledTaskService.class);

       // context.close();
    }
}
