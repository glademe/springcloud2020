package com.xiaohe.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * 功能描述
 *
 * @author 和振斌
 * @date 2021/1/13
 * @return
 */
public interface LoadBalancer {
        ServiceInstance instance(List<ServiceInstance> serviceInstances);
}
