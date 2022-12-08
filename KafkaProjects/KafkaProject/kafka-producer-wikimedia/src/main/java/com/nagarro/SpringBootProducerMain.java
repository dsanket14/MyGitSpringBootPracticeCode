package com.nagarro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootProducerMain implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootProducerMain.class);
    }

    @Autowired
    private  WikimediaChangesProducer wikimediaChangesProducer;

    @Override
    public void run(String... args) throws Exception {
       wikimediaChangesProducer.sendMsg();
    }
}