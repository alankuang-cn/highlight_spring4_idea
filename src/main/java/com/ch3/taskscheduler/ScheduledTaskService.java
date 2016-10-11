package com.ch3.taskscheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by 1 on 2016/10/11.
 */
@Service
public class ScheduledTaskService {

    private static final SimpleDateFormat dataFormat = new SimpleDateFormat("HH:mm:ss");


    @Scheduled(fixedRate =  5000)
    public void reportCurrentTime(){
        System.out.println("每隔5秒执行一次" +dataFormat.format(new Date()));
    }

    @Scheduled(cron = "0 0,17 14 * * ? ")
    public void fixTimeExceution(){
        System.out.println("在指定的时间内" +dataFormat.format(new Date()) +"执行");
    }
}
