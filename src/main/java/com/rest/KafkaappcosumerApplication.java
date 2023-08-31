package com.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class KafkaappcosumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaappcosumerApplication.class, args);
	}
	@KafkaListener(topics = "mykafkatopic", groupId = "newgroup")
	public void listenGroupFoo(String message) {
	    System.out.println("Received Message in newgroup " + message);
	}

}
