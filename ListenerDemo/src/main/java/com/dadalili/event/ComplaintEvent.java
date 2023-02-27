package com.dadalili.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author caoqian
 * @since 2023/2/27 12:41
 */
public class ComplaintEvent extends ApplicationEvent {

    public ComplaintEvent(Object source) {
        super(source);
    }

}
