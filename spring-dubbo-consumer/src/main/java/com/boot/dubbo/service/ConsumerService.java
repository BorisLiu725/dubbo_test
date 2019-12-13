package com.boot.dubbo.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ly.domain.User;
import com.ly.service.UserService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by BorisLiu on 2019/12/13
 */
@Service
public class ConsumerService {

    @Reference
    UserService userService;

    public void printUser(){
        User user = new User();
        user.setAge(12);
        user.setName("hahahha");
        userService.saveUser(user);
    }


}
