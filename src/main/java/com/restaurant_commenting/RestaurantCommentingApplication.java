package com.restaurant_commenting;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.restaurant_commenting.mapper")
@SpringBootApplication
public class RestaurantCommentingApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestaurantCommentingApplication.class, args);
    }

}
