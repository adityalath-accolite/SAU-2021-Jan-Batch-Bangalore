package com.assignment.KafkaMorning.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaSender {
	
	@Autowired
	private KafkaTemplate<String,String> kafkaTemplate;
	
	String afterPass = "AfterPass";
	
	@KafkaListener(topics="BeforePass", groupId="aditya")
	public void send(String messege)
	{
		kafkaTemplate.send(afterPass,messege);
	}
	
}
