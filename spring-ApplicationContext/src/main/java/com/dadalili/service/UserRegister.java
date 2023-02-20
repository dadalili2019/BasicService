package com.dadalili.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

/**
 * @author caoqian
 * @since 2023/2/20 23:17
 */
@Component
public class UserRegister {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void Register() {
        System.out.println("用户注册");
        applicationEventPublisher.publishEvent(new UserRegister());
    }
}
