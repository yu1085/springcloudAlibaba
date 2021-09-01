package com.java1234;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class NacosStockApplication2 {
    public static void main(String[] args) {
        SpringApplication.run(NacosStockApplication2.class,args);
    }
}
