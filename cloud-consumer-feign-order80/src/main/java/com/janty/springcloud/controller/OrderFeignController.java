package com.janty.springcloud.controller;

import com.janty.springcloud.entities.CommonResult;
import com.janty.springcloud.entities.Payment;
import com.janty.springcloud.service.PaymentFeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: Janty
 * @projectName: Cloud2021
 * @date: 2023/2/23 11:30
 * @description:
 */
@RestController
public class OrderFeignController {

    @Resource
    private PaymentFeignService paymentFeignService;  //调用远程的微服接口

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        return paymentFeignService.getPaymentById(id);
    }

    @GetMapping(value = "/consumer/payment/feign/timeout")
    public String paymentFeignTimeout(){
        return paymentFeignService.paymentFeignTimeout();
    }
}
