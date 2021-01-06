package com.cfl.security.distributed.uaa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 类描述：
 *
 * @ClassName UaaApplication
 * @Author msi
 * @Date 2021/1/6 22:44
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
@EnableFeignClients(basePackages = {"com.cfl.security.distributed.uaa"})
public class UaaServer {
    public static void main (String[] args) {
        SpringApplication.run(UaaServer.class);
    }
}
