package com.ch3.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created by 1 on 2016/10/11.
 */
@Service
public class AsyncTaskService {

    @Async
    public void executeAsyncTask(Integer i ){
        System.out.println("执行异步任务 " + i);
    }

    @Async
    public void executeAsyncTaskPlus(Integer i){
        System.out.println("执行异步任务 + 1 " +(i+1));
    }
}
