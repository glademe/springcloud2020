package com.xiaohe.springcloud.service;

import com.xiaohe.springcloud.entities.CommonResult;
import com.xiaohe.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * 功能描述
 *
 * @author 和振斌
 * @date 2021/1/17
 * @return
 */
@Component
public class PaymentFallbackService implements PaymentService {
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(444, "fallback");
    }
}