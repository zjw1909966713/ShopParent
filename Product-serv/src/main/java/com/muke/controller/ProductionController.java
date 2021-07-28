package com.muke.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: ProductionController
 * @Author: zjw
 * @Description: TODO
 * @Date: 2021/07/28 08:44
 * @Version: 1.0
 */
@RestController
public class ProductionController {

    @GetMapping("/product/{productId}")
    public String getProduct(@PathVariable Integer productId){
        return "iPhone12";
    }
}
