package com.angrycow1111.likesystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@EnableCaching
@MapperScan( basePackages = "com.angrycow1111.likesystem.mapper" )
@EntityScan( basePackages = "com.angrycow1111.likesystem.entity" )
@EnableScheduling
public class LikesystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(LikesystemApplication.class, args);
    }
}
