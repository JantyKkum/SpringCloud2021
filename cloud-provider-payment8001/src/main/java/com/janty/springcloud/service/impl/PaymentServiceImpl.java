package com.janty.springcloud.service.impl;

import com.janty.springcloud.dao.PaymentDao;
import com.janty.springcloud.entities.Payment;
import com.janty.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: Janty
 * @projectName: Cloud2021
 * @date: 2023/2/22 19:17
 * @description:
 */
@Service
public class PaymentServiceImpl implements PaymentService {

//    @Resource
    @Autowired
    private PaymentDao paymentDao;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    public Payment getPaymentById( Long id){
        return paymentDao.getPaymentById(id);
    }
}
