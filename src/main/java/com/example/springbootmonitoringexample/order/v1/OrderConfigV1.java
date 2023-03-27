package com.example.springbootmonitoringexample.order.v1;

import com.example.springbootmonitoringexample.order.OrderService;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OrderConfigV1 {

    @Bean
    OrderService oderService(MeterRegistry meterRegistry) {
        return new OrderServiceV1(meterRegistry);
    }

}