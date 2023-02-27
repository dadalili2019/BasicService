package com.dadalili;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author caoqian
 * @since 2023/2/27 12:18
 */
@SpringBootApplication
public class ListenerDemoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ListenerDemoApplication.class);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("系统正常运行ing......");
    }
}
