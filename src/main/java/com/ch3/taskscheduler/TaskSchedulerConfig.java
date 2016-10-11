package com.ch3.taskscheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by 1 on 2016/10/11.
 */
@Configuration
@ComponentScan("com.ch3.taskscheduler")
@EnableScheduling
public class TaskSchedulerConfig {


}
