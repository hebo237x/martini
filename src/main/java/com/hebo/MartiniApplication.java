package com.hebo;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.yimi.platform.common","com.hebo" })
@EnableCaching
public class MartiniApplication{

	@Bean
	public Queue helloQueue() {
		return new Queue("hello");
	}

	@Autowired
	public RabbitTemplate rabbitTemplate;

	public static void main(String[] args) {
		SpringApplication.run(MartiniApplication.class, args);
	}

}
