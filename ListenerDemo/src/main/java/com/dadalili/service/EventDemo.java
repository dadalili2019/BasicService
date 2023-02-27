package com.dadalili.service;

import com.dadalili.Register.RegisterPublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author caoqian
 * @since 2023/2/27 12:56
 */
@RestController
public class EventDemo {

    @Autowired
    RegisterPublisher publisher;

    @GetMapping("/testPublisher")
    public String testPublisher(String msg){
        publisher.createComplaint(msg);
        return "success";
    }
}
