package com.rainbow.customer.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author denglin
 * @version V1.0
 * @Description:
 * @ClassName: ProviderClient
 * @date 2018/9/5 14:52
 */

@FeignClient(value = "provider-service", fallback = ProviderClientHystrix.class)
public interface ProviderClient {
    @RequestMapping(method = RequestMethod.GET, value = "/add")
    Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);
}
