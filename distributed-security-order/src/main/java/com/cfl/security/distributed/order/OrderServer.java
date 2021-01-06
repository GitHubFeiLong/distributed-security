package com.cfl.security.distributed.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.core.annotation.Order;

/**
 * 类描述：
 *
 * @ClassName OrderServer
 * @Description TODO
 * @Author msi
 * @Date 2021/1/6 23:04
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderServer {
    public static void main(String[] args) {
        SpringApplication.run(OrderServer.class);
    }
}
