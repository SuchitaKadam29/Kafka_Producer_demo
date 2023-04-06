package com.kafka.producer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.producer.entity.Book;

@RestController
public class ProducerDemoController {
	
	@Autowired
	KafkaTemplate<String, Book> kafkaTemplate;
	
	private static final String TOPIC = "MyTopic";

	/*
	 * @GetMapping("/publish/{message}") public String publishMessage(@PathVariable
	 * final String message) { kafkaTemplate.send(TOPIC, message); return
	 * "Message published Successfully " + message; }
	 */
	
	@PostMapping("/publish")
	public String publishMessage(@RequestBody Book book) {
		kafkaTemplate.send(TOPIC, book);
		return "Message published Successfully ";
	}
	
}
