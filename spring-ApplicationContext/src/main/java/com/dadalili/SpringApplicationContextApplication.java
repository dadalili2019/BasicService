package com.dadalili;

import com.dadalili.service.UserRegister;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author caoqian
 * @since 2023/2/20 17:31
 */
@SpringBootApplication
public class SpringApplicationContextApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringApplicationContextApplication.class, args);

        //context.publishEvent(new Register(context));
        context.getBean(UserRegister.class).Register();
    }


}
