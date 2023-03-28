package com.example.springbootmonitoringexample.order.v3;

import com.example.springbootmonitoringexample.order.OrderService;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OrderConfigV3 {

    @Bean
    OrderService orderService(MeterRegistry meterRegistry) {
        return new OrderServiceV3(meterRegistry);
    }

}
