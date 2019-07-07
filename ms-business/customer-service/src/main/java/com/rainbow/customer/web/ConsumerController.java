package com.rainbow.customer.web;

import com.rainbow.customer.service.ProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author denglin
 * @version V1.0
 * @Description:
 * @ClassName: ConsumerController
 * @date 2018/9/5 14:20
 */
@RestController
@RefreshScope
public class ConsumerController {

    @Value("${from}")
    private String from;
    @Value("${common}")
    private String common;

    @Autowired
    ProviderClient providerClient;

    @RequestMapping("/from")
    public String from() {
        return this.from;
    }

    @RequestMapping("/common")
    public String common(){
        return this.common;
    }

    @RequestMapping(value = "/add2", method = RequestMethod.GET)
    public Integer add2() {
        return providerClient.add(10, 20);
    }

}
