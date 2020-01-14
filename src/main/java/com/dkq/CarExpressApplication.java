package com.dkq;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.dkq.mapper")
public class CarExpressApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarExpressApplication.class, args);
    }

}
