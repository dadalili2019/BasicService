package com.dadalili.Listener;

import com.dadalili.event.ComplaintEvent;
import lombok.extern.java.Log;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author caoqian
 * @since 2023/2/27 13:42
 */
@Component
@Log
public class EventListenerService2 {

    @EventListener
    public void getMsg(ComplaintEvent event) {
        log.info("先执行业务2....." + event.getSource());
    }


}
