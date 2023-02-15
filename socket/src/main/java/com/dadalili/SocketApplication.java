package com.dadalili;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author caoqian
 * @since 2023/2/15 23:40
 */
@SpringBootApplication
public class SocketApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SocketApplication.class);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("系统正常运行......");
    }
}
