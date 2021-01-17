package com.xiaohe.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * 功能描述
 *
 * @author 和振斌
 * @date 2021/1/14
 * @return
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String paymentInfo_OK(Integer id) {
        return "PaymentFallbackService fall back-paymentInfo_OK";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "PaymentFallbackService fall back-paymentInfo_TimeOut";
    }
}
