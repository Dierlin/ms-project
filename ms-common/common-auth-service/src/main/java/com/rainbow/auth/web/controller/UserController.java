package com.rainbow.auth.web.controller;

import com.rainbow.auth.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author denglin
 * @version V1.0
 * @Description:
 * @ClassName: CommonAuthController
 * @date 2018/9/10 15:24
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @PostMapping
    public User create(@Valid @RequestBody User user) {

        return user;
    }

}
