package com.assignment.KafkaMorning.Configuration;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfiguration {

	@Bean
	public NewTopic BeforePass()
	{
		return TopicBuilder.name("BeforePass").partitions(1).replicas(1).build();
	}
	
	@Bean
	public NewTopic AfterPass()
	{
		return TopicBuilder.name("AfterPass").partitions(1).replicas(1).build();
	}
	
}
