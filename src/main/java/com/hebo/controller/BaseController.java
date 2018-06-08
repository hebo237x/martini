package com.hebo.controller;

import com.hebo.common.RedisUtils;
import com.hebo.service.TestService;
import com.hebo.service.UserService;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by hebo on 2018/4/2.
 */
public class BaseController {

    @Autowired
    public UserService userService;

    @Autowired
    public TestService testService;

    @Autowired
    public RedisUtils redisUtils;

    @Autowired
    public RabbitTemplate rabbitTemplate;
}
