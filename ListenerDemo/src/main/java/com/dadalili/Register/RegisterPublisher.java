package com.dadalili.Register;

import com.dadalili.event.ComplaintEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author caoqian
 * @since 2023/2/27 12:48
 */
@Component
public class RegisterPublisher {

    @Autowired
    private ApplicationContext context;

    public void createComplaint(String msg){
        context.publishEvent(new ComplaintEvent(msg));
    }

}
