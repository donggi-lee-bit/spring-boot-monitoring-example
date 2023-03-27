package com.example.springbootmonitoringexample.order.v0;

import com.example.springbootmonitoringexample.order.OrderService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OrderConfigV0 {

    @Bean
    OrderService oderService() {
        return new OrderServiceV0();
    }

}
