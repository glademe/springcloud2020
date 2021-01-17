package com.xiaohe.springcloud.controller;

import com.xiaohe.springcloud.service.IMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 功能描述
 *
 * @author 和振斌
 * @date 2021/1/16
 * @return
 */
@RestController
public class SendMessageController {

    @Resource
    private IMessageProvider iMessageProvider;
    @GetMapping("/sendMessage")
    public String sendMessage(){
        return iMessageProvider.send();
    }
}
