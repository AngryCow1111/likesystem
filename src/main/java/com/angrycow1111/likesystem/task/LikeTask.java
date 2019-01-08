package com.angrycow1111.likesystem.task;


import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

public class LikeTask {
   // @Scheduled( cron = "0/1 * * * * ? " )
    public void findAll() {
        System.out.println("定时器执行！");

    }
}
