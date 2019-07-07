package com.rainbow.web;

import com.rainbow.web.filter.WebFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringCloudApplication
@EnableZuulProxy
public class GatewayWebServiceApplication {

    @Bean
    public WebFilter accessFilter() {
        return new WebFilter();
    }

    public static void main(String[] args) {
        SpringApplication.run(GatewayWebServiceApplication.class, args);
    }
}
