package com.muke;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName: StockApplication
 * @Author: zjw
 * @Description: TODO
 * @Date: 2021/07/28 09:18
 * @Version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class StockApplication {
    public static void main(String[] args) {
        SpringApplication.run(StockApplication.class,args);
    }
}
