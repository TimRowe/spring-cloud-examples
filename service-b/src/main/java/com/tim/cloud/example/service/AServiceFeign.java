package com.tim.cloud.example.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "a")
public interface AServiceFeign {
    /**  查询根据idList查询商品列表  */
    @GetMapping("/hi")
    public String hi();
}
