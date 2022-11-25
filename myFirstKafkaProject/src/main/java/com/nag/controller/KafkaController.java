package com.nag.controller;


import com.nag.kafka.KafkaProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class KafkaController {

    private KafkaProducer kafkaProducer;

    public KafkaController(KafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    //localhost:9191/api/publish?msg=Hello
    @GetMapping("/publish")
    public ResponseEntity<String> publishMsg(@RequestParam String msg){
        kafkaProducer.sendMessage(msg);
        return ResponseEntity.ok("Message Sent to the Topic");
    }
}
