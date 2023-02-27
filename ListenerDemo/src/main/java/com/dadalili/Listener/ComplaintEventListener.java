package com.dadalili.Listener;

import com.dadalili.event.ComplaintEvent;
import lombok.extern.java.Log;
import org.springframework.context.event.EventListener;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

/**
 * @author caoqian
 * @since 2023/2/27 12:52
 */
@Log
@Component
public class ComplaintEventListener implements Ordered{

    @EventListener
    public void getMsg(ComplaintEvent event) {
        log.info("order=1收到监听的的消息: " + event.getSource());
    }

    @Override
    public int getOrder() {
        return 2;
    }
}
