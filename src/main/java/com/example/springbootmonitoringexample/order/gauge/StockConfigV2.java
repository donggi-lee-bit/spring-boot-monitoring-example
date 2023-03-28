package com.example.springbootmonitoringexample.order.gauge;

import com.example.springbootmonitoringexample.order.OrderService;
import io.micrometer.core.instrument.Gauge;
import io.micrometer.core.instrument.binder.MeterBinder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class StockConfigV2 {

    @Bean
    public MeterBinder stockSize(OrderService orderService) {
        return meterRegistry -> Gauge.builder("my.stock", orderService, service -> {
            log.info("stock gauge call");
            return service.getStock().get();
        }).register(meterRegistry);
    }

}
