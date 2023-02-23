package com.janty.springcloud.dao;

import com.janty.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * @author: Janty
 * @projectName: Cloud2021
 * @date: 2023/2/22 19:15
 * @description:
 */
@Component       //代替@Repository声明bean
@Mapper               //mybatis提供的，等价：@MapperScan("com.atguigu.springcloud.dao")
//@Repository     //spring提供的。在此，只是为了声明bean对象
public interface PaymentDao {
    public int create(Payment payment);
    public Payment getPaymentById(@Param("id") Long id);
}
