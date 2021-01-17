package com.xiaohe.springcloud.service;

import com.xiaohe.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {
    //添加
    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
