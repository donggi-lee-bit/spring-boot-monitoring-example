package com.example.springbootmonitoringexample;

import com.example.springbootmonitoringexample.order.v2.OrderConfigV2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

//@Import(OrderConfigV0.class)
//@Import(OrderConfigV1.class)
@Import(OrderConfigV2.class)
@SpringBootApplication(scanBasePackages = "com.example.springbootmonitoringexample.controller")
public class SpringBootMonitoringExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMonitoringExampleApplication.class, args);
    }

}
