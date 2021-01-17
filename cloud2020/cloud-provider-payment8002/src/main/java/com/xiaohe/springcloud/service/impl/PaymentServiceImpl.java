package com.xiaohe.springcloud.service.impl;

import com.xiaohe.springcloud.dao.PaymentDao;
import com.xiaohe.springcloud.entities.Payment;
import com.xiaohe.springcloud.service.PaymentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 功能描述
 *
 * @author 和振斌
 * @date 2021/1/11
 * @return
 */
/*注意*/
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    PaymentDao paymentDao;
    //添加
    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    //查找
    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
