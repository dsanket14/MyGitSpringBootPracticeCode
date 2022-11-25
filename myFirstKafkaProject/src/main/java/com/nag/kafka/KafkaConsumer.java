package com.nag.kafka;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    private static final Logger logger= LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(topics = "myFirstTopic",groupId = "group-id")
    public void consumeMessage(String msg){
        logger.info("Message consume by Consumer "+msg);
    }
}
