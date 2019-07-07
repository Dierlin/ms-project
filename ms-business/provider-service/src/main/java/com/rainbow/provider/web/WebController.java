package com.rainbow.provider.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add(@RequestParam Integer a, @RequestParam Integer b) {
        List<ServiceInstance> instances = client.getInstances("provider-service");
        ServiceInstance instance = instances.get(0);
        Integer r = a + b;
        logger.info("/add, host:" + instance.getHost() + ", port:" + instance.getPort() + ", service_id:" + instance.getServiceId() + ", result:" + r);
        return r;
    }

}
