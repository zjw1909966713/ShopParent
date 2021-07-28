package com.muke.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: ShopCartController
 * @Author: zjw
 * @Description: TODO
 * @Date: 2021/07/28 09:33
 * @Version: 1.0
 */
@RestController
public class ShopCartController {


    @GetMapping("/shopcart/remove")
    public String remove(Integer productId,Integer userId){

        return "移除购物车成功";
    }

}
