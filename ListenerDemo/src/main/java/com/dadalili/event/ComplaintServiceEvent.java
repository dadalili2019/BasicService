package com.dadalili.event;

import com.dadalili.vo.Revert;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;

/**
 * @author caoqian
 * @since 2023/2/27 13:43
 */
@Getter
@Setter
public class ComplaintServiceEvent extends ApplicationEvent {

    private Revert revert;

    public ComplaintServiceEvent(Object source,Revert revert) {
        super(source);
        this.revert=revert;
    }

}
