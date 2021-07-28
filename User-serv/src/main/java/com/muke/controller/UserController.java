package com.muke.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: UserController
 * @Author: zjw
 * @Description: TODO
 * @Date: 2021/07/28 08:57
 * @Version: 1.0
 */
@RestController
public class UserController {

    @GetMapping("/user/{userId}")
    public String getUserName(@PathVariable Integer userId){
        return "上官煜烁老师";

    }
}
