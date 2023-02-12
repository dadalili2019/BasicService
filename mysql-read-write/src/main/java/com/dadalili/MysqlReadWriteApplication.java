package com.dadalili;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author caoqian
 * @since 2023/2/12 18:17
 */
@SpringBootApplication
public class MysqlReadWriteApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(MysqlReadWriteApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("系统正常运行ing......");
    }
}
