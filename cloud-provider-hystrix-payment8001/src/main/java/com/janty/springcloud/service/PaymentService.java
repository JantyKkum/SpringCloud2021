package com.janty.springcloud.service;

import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author: Janty
 * @projectName: Cloud2021
 * @date: 2023/2/23 15:00
 * @description:
 */

public interface PaymentService {
    public String paymentInfo_OK(Integer id);
    public String payment_Timeout(Integer id);
    String paymentCircuitBreaker(Integer id);
}
