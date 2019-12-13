package com.boot.dubbo.config;

import com.alibaba.dubbo.config.*;
import com.ly.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by BorisLiu on 2019/12/13
 */

@Configuration
public class MyDubboConfig {


    /**
     * 指定当前服务的名字
    * 替代了<dubbo:application name='boot-user-service-provider'></dubbo:application>
     * 这个标签
    * */
    @Bean
    public ApplicationConfig applicationConfig(){
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("boot-user-service-provider");
        return applicationConfig;
    }

    /**
     *指定注册中心的位置
     * <dubbo:registry protocol='zookeeper' address='127.0.0.1:2181'></dubbo:registry>
     * */
    @Bean
    public RegistryConfig registryConfig(){
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setProtocol("zookeeper");
        registryConfig.setAddress("127.0.0.1");
        registryConfig.setPort(2181);
        return registryConfig;
    }

    /**
     * 指定通信规则
     * <dubbo:protocol name='dubbo' prot="20882"></dubbo:protocol>
     * */
    @Bean
    public ProtocolConfig protocolConfig(){
        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setName("dubbo");
        protocolConfig.setPort(20882);
        return protocolConfig;
    }

    /**
     * 暴露的服务
     * */
    @Bean
    public ServiceConfig<UserService> userServiceConfig(UserService userService){
        ServiceConfig<UserService> userServiceConfig = new ServiceConfig<>();
        userServiceConfig.setInterface(UserService.class);
        userServiceConfig.setRef(userService);
        userServiceConfig.setVersion("1.0.0");

        //配置每一个methodConfig信息
        MethodConfig methodConfig = new MethodConfig();
        methodConfig.setName("saveUser");
        methodConfig.setTimeout(1000); //设置方法调用超时

        List<MethodConfig> methodConfigList = new ArrayList<>();
        methodConfigList.add(methodConfig);

        userServiceConfig.setMethods(methodConfigList);

        return userServiceConfig;
    }

    /***
     *
     * 统一设置服务提供方规则
     */
    @Bean
    public ProviderConfig providerConfig(){
        ProviderConfig providerConfig = new ProviderConfig();
        providerConfig.setTimeout(1000);
        return providerConfig;
    }

    /**
     * 监控中心的配置
     * */
    @Bean
    public MonitorConfig monitorConfig(){
        MonitorConfig monitorConfig = new MonitorConfig();
        monitorConfig.setProtocol("registry");
        return monitorConfig;
    }


}
