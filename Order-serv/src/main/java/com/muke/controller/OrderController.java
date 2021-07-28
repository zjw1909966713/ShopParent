package com.muke.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName: OrderController
 * @Author: zjw
 * @Description: TODO
 * @Date: 2021/07/27 14:01
 * @Version: 1.0
 */
@RestController
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/order/create")
    public String createOrder(Integer productId,Integer userId){

        /*
        String productName = restTemplate.getForObject("http://localhost:9000/product/" + productId, String.class);
        String userName = restTemplate.getForObject("http://localhost:10000/user/" + userId, String.class);
        String result = restTemplate.getForObject("http://localhost:11000/stock/reduce/" + productId, String.class);
        String shopresult = restTemplate.getForObject("http://localhost:12000//shopcart/remove?productId=" + productId+"&userId="+userId, String.class);

        return "用户:"+userName+",购买商品"+productName+","+result+","+shopresult;
         */

        String result = restTemplate.getForObject("http://stock-serv/stock/reduce/" + productId, String.class);


        return result;
    }
}
