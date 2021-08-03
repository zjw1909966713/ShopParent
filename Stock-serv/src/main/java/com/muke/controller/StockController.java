package com.muke.controller;

import com.muke.dao.StockRepository;
import com.muke.entity.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * @ClassName: StockController
 * @Author: zjw
 * @Description: TODO
 * @Date: 2021/07/28 09:19
 * @Version: 1.0
 */
@RestController
public class StockController {

    @Autowired
    private StockRepository stockRepository;

    @GetMapping("/stock/reduce/{productId}")
    public String  reduce(@PathVariable Integer productId){
        Random random=new Random();
        if(random.nextBoolean()){
            throw new RuntimeException("这个是mock的错误");
        }


        System.out.println("减库存1个成功");

        Stock stock = stockRepository.getByProductId(productId);
        if(stock==null){
            return "fail";
        }

        stock.setCount(stock.getCount()-1);
        stockRepository.save(stock);

        return "success";
    }
}
