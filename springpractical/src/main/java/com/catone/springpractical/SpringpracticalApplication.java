package com.catone.springpractical;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringpracticalApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringpracticalApplication.class, args);
    }

}
