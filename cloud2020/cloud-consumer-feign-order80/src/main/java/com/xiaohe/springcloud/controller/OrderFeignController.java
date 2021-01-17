package com.xiaohe.springcloud.controller;

import com.xiaohe.springcloud.entities.CommonResult;
import com.xiaohe.springcloud.entities.Payment;
import com.xiaohe.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 功能描述
 *
 * @author 和振斌
 * @date 2021/1/13
 * @return
 */
@RestController
@Slf4j
public class OrderFeignController {

    @Resource
    private PaymentService paymentService;
    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        CommonResult<Payment> payment = paymentService.getPaymentById(id);
        return payment;
    }
    @GetMapping("/consumer/payment/feign/timeout")
    public String paymentFeignTimeout(){
        //openfeign客户端一般默认等待1s
         return paymentService.paymentFeignTimeout();
    }
}
