package com.hebo.task;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by hebo on 2018/5/30.
 */
@Component
@RabbitListener(queues = "hello")
public class TestQ {

    @RabbitHandler
    public void process(String hello) {
        System.out.println(hello);
    }
}
