package com.nag.controller;

import com.nag.kafka.KafkaJSONProducer;
import com.nag.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/json")
public class JSONController {

    private KafkaJSONProducer kafkaJSONProducer;

    public JSONController(KafkaJSONProducer kafkaJSONProducer) {
        this.kafkaJSONProducer = kafkaJSONProducer;
    }

    @PostMapping("/publish")
    public ResponseEntity<String> sendMessage(@RequestBody User user){
        kafkaJSONProducer.sendMessage(user);
        return ResponseEntity.ok("Json Msg sent");
    }
}
