package com.muke.controller;

import com.muke.entity.SkillGood;
import com.muke.service.SkillGoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName: ProductionController
 * @Author: zjw
 * @Description: TODO
 * @Date: 2021/07/28 08:44
 * @Version: 1.0
 */
@RestController
public class ProductionController {

    @Autowired
    private SkillGoodService skillGoodService;

    @Value("${server.port}")
    private String server;

    @GetMapping("/product/{productId}")
    public SkillGood getProduct(@PathVariable Long productId){
        System.out.println("调用商品服务");
        return skillGoodService.queryProduct(productId);
    }

    @GetMapping("/product/server")
    public String get(){
        return server;
    }

    @PostMapping("/product")
    public  String update(@RequestBody SkillGood skillGood){
        skillGoodService.update(skillGood);
        return "更新库存成功";
    }

}
