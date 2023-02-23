package com.janty.springcloud.service;

import com.janty.springcloud.entities.Payment;

/**
 * @author: Janty
 * @projectName: Cloud2021
 * @date: 2023/2/22 19:17
 * @description:
 */
public interface PaymentService {
    public int create(Payment payment); //写
    public Payment getPaymentById(Long id);  //读取
}
