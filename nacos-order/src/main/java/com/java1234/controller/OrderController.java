package com.java1234.controller;

import com.java1234.feign.StockFiegnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Resource
    StockFiegnService stockFiegnService;

    @RequestMapping("/test")
    public String test(){
        return stockFiegnService.test("牛逼");
    }
}
