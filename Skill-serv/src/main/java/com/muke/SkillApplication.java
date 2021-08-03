package com.muke;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName: SkillApplication
 * @Author: zjw
 * @Description: TODO
 * @Date: 2021/07/31 11:38
 * @Version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableAsync
public class SkillApplication {
    public static void main(String[] args) {
        SpringApplication.run(SkillApplication.class,args);
    }



    @Bean
    public RedisTemplate<Object, Object> redisTemplate(
            RedisConnectionFactory redisConnectionFactory) {
        RedisTemplate<Object, Object> template = new RedisTemplate<>();
        template.setConnectionFactory(redisConnectionFactory);
        //采用普通的key 为 字符串
        template.setKeySerializer(new StringRedisSerializer());
        return template;
    }

    @Bean
    @LoadBalanced
    public RestTemplate create() {
        return new RestTemplate();
    }
}
