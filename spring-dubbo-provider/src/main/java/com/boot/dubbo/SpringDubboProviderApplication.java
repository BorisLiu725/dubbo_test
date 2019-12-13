package com.boot.dubbo;


import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by BorisLiu on 2019/12/13
 */


@SpringBootApplication
//@ImportResource(locations = "classpath:provider.xml")
@EnableDubbo(scanBasePackages = "com.boot.dubbo")
public class SpringDubboProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringDubboProviderApplication.class, args);
    }
}
