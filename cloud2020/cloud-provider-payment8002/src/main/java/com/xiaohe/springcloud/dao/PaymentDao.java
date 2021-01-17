package com.xiaohe.springcloud.dao;

import com.xiaohe.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDao {

    //添加
    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
