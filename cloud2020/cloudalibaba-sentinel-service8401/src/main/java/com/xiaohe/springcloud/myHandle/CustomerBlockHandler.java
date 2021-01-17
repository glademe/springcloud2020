package com.xiaohe.springcloud.myHandle;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.xiaohe.springcloud.entities.CommonResult;

/**
 * 功能描述
 *
 * @author 和振斌
 * @date 2021/1/17
 * @return
 */
public class CustomerBlockHandler {
    public static CommonResult handlerException(BlockException exception) {
        return new CommonResult(444, "客户自定义，global handlerException---1");
    }

    public static CommonResult handlerException2(BlockException exception) {
        return new CommonResult(444, "客户自定义，global handlerException---2");
    }
}
