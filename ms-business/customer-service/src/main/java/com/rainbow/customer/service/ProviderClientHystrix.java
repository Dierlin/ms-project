package com.rainbow.customer.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author denglin
 * @version V1.0
 * @Description:
 * @ClassName: ProviderClientHystrix
 * @date 2018/9/5 15:33
 */
@Component
public class ProviderClientHystrix implements ProviderClient {
    
    @Override
    public Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b) {
        return -9999;
    }
}
