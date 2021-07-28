package com.muke.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: StockController
 * @Author: zjw
 * @Description: TODO
 * @Date: 2021/07/28 09:19
 * @Version: 1.0
 */
@RestController
public class StockController {

    @GetMapping("/stock/reduce/{productId}")
    public String  reduce(@PathVariable Integer productId){
        System.out.println("减库存1个成功");
        return "减库存1个成功";
    }
}
