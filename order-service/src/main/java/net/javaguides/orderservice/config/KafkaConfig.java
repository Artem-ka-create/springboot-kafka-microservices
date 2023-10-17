package net.javaguides.orderservice.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {

    @Value("order_topics")
    private String topicName;

    // Spring Bean for Kafka topic
    @Bean
    public NewTopic topic(){
        return TopicBuilder.name(topicName).build();
    }
}
