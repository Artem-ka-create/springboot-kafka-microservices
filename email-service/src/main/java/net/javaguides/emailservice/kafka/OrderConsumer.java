package net.javaguides.emailservice.kafka;

import net.javaguides.basedomains.dto.OrderEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OrderConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrderConsumer.class);

    @KafkaListener(topics = "order_topics", groupId = "email")
    public void consume(OrderEvent orderEvent){

        LOGGER.info(String.format("Order event recieved in email service => %s", orderEvent.toString()));

        //save data in db

    }
}
