package com.rainbow.order.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author denglin
 * @version V1.0
 * @Description:
 * @ClassName: WebController
 * @date 2018/9/5 10:52
 */
@RestController
public class WebController {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private DiscoveryClient client;


    @Autowired
    ConsumerService consumerService;

    @RequestMapping(value = "/add1", method = RequestMethod.GET)
    public String add1() {
        return consumerService.addService();
    }


    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add(@RequestParam Integer a, @RequestParam Integer b) {
        List<ServiceInstance> instances = client.getInstances("business-order");
        ServiceInstance instance = instances.get(0);
        Integer r = a + b;
        logger.info("/add, host:" + instance.getHost() + ", port:" + instance.getPort() + ", service_id:" + instance.getServiceId() + ", result:" + r);
        return r;
    }

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    LoadBalancerClient loadBalancerClient;

    @GetMapping("/consumer")
    public String dc() {
        ServiceInstance serviceInstance = loadBalancerClient.choose("eureka-client");
        String url = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/dc";
        System.out.println(url);
        return restTemplate.getForObject(url, String.class);
    }
}
