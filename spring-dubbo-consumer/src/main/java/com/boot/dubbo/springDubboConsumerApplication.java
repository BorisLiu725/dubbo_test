package com.boot.dubbo;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by BorisLiu on 2019/12/13
 */

@SpringBootApplication
@EnableDubboConfiguration
public class springDubboConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(springDubboConsumerApplication.class,args);
    }
}
