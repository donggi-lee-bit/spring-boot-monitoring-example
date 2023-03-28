package com.example.springbootmonitoringexample.order.gauge;

import com.example.springbootmonitoringexample.order.OrderService;
import io.micrometer.core.instrument.Gauge;
import io.micrometer.core.instrument.MeterRegistry;
import javax.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StockConfigV1 {

    @Bean
    public MyStockMetric myStockMetric(OrderService orderService, MeterRegistry meterRegistry) {
        return new MyStockMetric(orderService, meterRegistry);
    }

    @Slf4j
    static class MyStockMetric {

        private OrderService orderService;
        private MeterRegistry meterRegistry;

        public MyStockMetric(OrderService orderService, MeterRegistry meterRegistry) {
            this.orderService = orderService;
            this.meterRegistry = meterRegistry;
        }

        @PostConstruct
        public void init() {
            Gauge.builder("my.store", orderService, service -> {
                log.info("stock.gauge call");
                return service.getStock().get();
            }).register(meterRegistry);
        }
    }
}
