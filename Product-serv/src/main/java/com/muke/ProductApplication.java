package com.muke;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @ClassName: ProductApplication
 * @Author: zjw
 * @Description: TODO
 * @Date: 2021/07/27 14:17
 * @Version: 1.0
 */
@SpringBootApplication
@EnableScheduling
public class ProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class,args);
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

}
