package com.liuchao.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = {"com.liuchao.commonredis.config","com.liuchao.web","com.liuchao.providerfeign.provider"})
@EnableFeignClients(basePackages="com.liuchao.providerfeign.provider")
public class WebApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }

}
