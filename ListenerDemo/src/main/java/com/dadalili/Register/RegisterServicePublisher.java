package com.dadalili.Register;

import com.dadalili.event.ComplaintServiceEvent;
import com.dadalili.vo.Revert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author caoqian
 * @since 2023/2/27 13:46
 */
@Component
public class RegisterServicePublisher {

    @Autowired
    private ApplicationContext context;

    public void createComplaint1(Revert msg) {
        context.publishEvent(new ComplaintServiceEvent(this, msg));
    }

}
