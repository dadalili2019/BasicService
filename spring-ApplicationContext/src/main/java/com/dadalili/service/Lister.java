package com.dadalili.service;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author caoqian
 * @since 2023/2/20 23:18
 */
@Component
public class Lister {

    @EventListener
    public void getRegister(UserRegister userRegister){
        System.out.println(userRegister);
    }
}
