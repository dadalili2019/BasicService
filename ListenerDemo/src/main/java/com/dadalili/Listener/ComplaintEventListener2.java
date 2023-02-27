package com.dadalili.Listener;

import com.dadalili.event.ComplaintEvent;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;
import org.springframework.context.event.EventListener;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

/**
 * @author caoqian
 * @since 2023/2/27 13:08
 */
@Component
@Log
public class ComplaintEventListener2 implements Ordered {

    @EventListener
    public void getMsg(ComplaintEvent event){
        log.info("order=2收到的消息: "+event.getSource());
    }

    @Override
    public int getOrder() {
        return 1;
    }
}
