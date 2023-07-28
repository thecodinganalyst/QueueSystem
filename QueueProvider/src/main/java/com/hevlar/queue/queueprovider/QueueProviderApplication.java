package com.hevlar.queue.queueprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;

@SpringBootApplication
@RestController
public class QueueProviderApplication {

    AtomicInteger centralQueue = new AtomicInteger(1);

    public static void main(String[] args) {
        SpringApplication.run(QueueProviderApplication.class, args);
    }

    @GetMapping
    public Integer getQueue(){
        return centralQueue.getAndIncrement();
    }

}
