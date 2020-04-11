package com.djxc.dhome;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.djxc.dhome.mapper")
public class DhomeApplication {

    public static void main(String[] args) {
        SpringApplication.run(DhomeApplication.class, args);
    }

}
