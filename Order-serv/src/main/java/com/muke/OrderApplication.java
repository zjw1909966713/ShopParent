package com.muke;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName: OrderApplication
 * @Author: zjw
 * @Description: TODO
 * @Date: 2021/07/27 13:59
 * @Version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderApplication {

    @Bean
    @LoadBalanced
    public RestTemplate createRestTemplate(){
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class,args);
    }
}
