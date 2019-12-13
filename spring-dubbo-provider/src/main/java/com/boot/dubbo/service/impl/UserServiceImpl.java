package com.boot.dubbo.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.ly.domain.User;
import com.ly.service.UserService;

/**
 * Created by BorisLiu on 2019/12/13
 */
@Service//(暴露服务，现在替换成配置类配置了)
@org.springframework.stereotype.Service
public class UserServiceImpl implements UserService {

    @Override
    public User saveUser(User user) {
        user.setAge(123);
        System.out.println("save=="+user);
        return user;
    }
}
