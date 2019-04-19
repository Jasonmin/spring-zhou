package com.forezp;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Queue;

@SpringBootApplication
public class RabbitmqApplication {

    final static String queueName = "spring-boot";

    @Bean
    Queue queue() {
    }
}
