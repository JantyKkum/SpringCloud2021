package com.janty.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author: Janty
 * @projectName: Cloud2021
 * @date: 2023/2/23 16:52
 * @description:
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_OK , (┬＿┬)";
    }

    @Override
    public String payment_Timeout(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut , (┬＿┬)";
    }
}
