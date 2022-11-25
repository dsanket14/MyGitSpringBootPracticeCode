package com.nag.kafka;

import com.nag.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class KafkaJSONProducer {

    private static final Logger logger = LoggerFactory.getLogger(KafkaJSONProducer.class);

    private KafkaTemplate<String, User> kafkaTemplate;

    public KafkaJSONProducer(KafkaTemplate<String, User> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(User user){
        logger.info(String.format("User msg send="+ user.toString()));

        Message<User> message = MessageBuilder
                .withPayload(user)
                .setHeader(KafkaHeaders.TOPIC,"myFirstTopicJson")
                .build();

        kafkaTemplate.send(message);

    }
}
