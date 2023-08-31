package com.rest;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import model.Message;
@RestController
public class KafkController {
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	
	
	@GetMapping("/sendmessage")
	public ResponseEntity<?> sendMessage(@RequestBody Message message) throws InterruptedException, ExecutionException
	{
	
		 ListenableFuture<SendResult<String, String>> future = kafkaTemplate.send("mykafkatopic", message.getTextMessage());
	     
	    SendResult<String,String> result= future.get();
		System.out.println(result.getProducerRecord());
		   
		//kafkaTemplate.send("mykafkatopic",message.getTextMessage());
		   return new ResponseEntity("text message sent to topic",HttpStatus.OK);
	}

}
