package com.nag.kafka;

import com.nag.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.embedded.undertow.UndertowServletWebServer;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaJsonConsumer {

    private static final Logger logger = LoggerFactory.getLogger(KafkaJsonConsumer.class);


    @KafkaListener(topics = "myFirstTopicJson",groupId = "group-id")
    public void kafkaJsonConsumer(User user){
        logger.info(String.format("Json Message Received: "+user.toString()));
    }
}
