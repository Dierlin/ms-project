package com.rainbow.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin2.server.internal.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class SystemZipkinServer {

    public static void main(String[] args) {
        SpringApplication.run(SystemZipkinServer.class, args);
    }
}
