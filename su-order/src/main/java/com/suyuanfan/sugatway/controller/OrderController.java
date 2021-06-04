package com.suyuanfan.sugatway.controller;

import com.suyuanfan.sugatway.common.Result;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @PostMapping("/bookOrder")
    public Result bookOrder() {
        System.out.println("Enter order service!");
        return Result.success("Enter order service!");
    }
}
