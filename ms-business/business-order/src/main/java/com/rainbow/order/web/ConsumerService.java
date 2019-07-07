package com.rainbow.order.web;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author denglin
 * @version V1.0
 * @Description:
 * @ClassName: ConsumerService
 * @date 2018/9/5 15:27
 */
@Service
public class ConsumerService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "addServiceFallback")//需要依赖Hystrix包
    public String addService() {
        return restTemplate.getForEntity("http://provider-service/add?a=10&b=20", String.class).getBody();
    }

    public String addServiceFallback() {
        return "error";
    }

}
