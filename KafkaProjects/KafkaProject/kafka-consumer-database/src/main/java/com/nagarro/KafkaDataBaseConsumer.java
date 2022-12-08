package com.nagarro;

import com.nagarro.model.WilkiMediaData;
import com.nagarro.repo.WikiMediaRepo;
import jakarta.websocket.server.ServerEndpoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaDataBaseConsumer {


    private static  final Logger logger = LoggerFactory.getLogger(KafkaDataBaseConsumer.class);

    @Autowired
    private WikiMediaRepo wikiMediaRepo;


        @KafkaListener(topics = "wikimedia_recentchange",groupId = "group-id")

        public void consumer(String eventMsg){
            logger.info(String.format("Event Message Received: "+eventMsg));
            WilkiMediaData wilkiMediaData = new WilkiMediaData();
            wilkiMediaData.setWikiEventData(eventMsg);
            wikiMediaRepo.save(wilkiMediaData);
        }
}
