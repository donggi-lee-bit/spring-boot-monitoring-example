package com.example.springbootmonitoringexample;

import com.example.springbootmonitoringexample.order.v0.OrderConfigV0;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication(scanBasePackages = "com.example.springbootmonitoringexample.controller")
@Import(OrderConfigV0.class)
public class SpringBootMonitoringExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMonitoringExampleApplication.class, args);
    }

}
