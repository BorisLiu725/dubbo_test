package com.boot.dubbo.controller;

import com.boot.dubbo.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by BorisLiu on 2019/12/13
 */
@RestController
public class UserController {

    @Autowired
    private ConsumerService consumerService;

    @RequestMapping("/save")
    public void saveUser() {
        consumerService.printUser();
    }
}