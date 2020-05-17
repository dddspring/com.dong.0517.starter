package com.dong.starter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnWebApplication
@EnableConfigurationProperties(HelloPropeties.class)
public class HelloServiceAutoConfig {

    @Autowired
    HelloPropeties helloPropeties;

    @Bean
    public HelloService getService(){
        HelloService helloService = new HelloService();
        helloService.setHelloPropeties(helloPropeties);
        return helloService;
    }

}
