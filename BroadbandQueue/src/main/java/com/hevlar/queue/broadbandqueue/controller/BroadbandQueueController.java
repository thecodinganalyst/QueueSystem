package com.hevlar.queue.broadbandqueue.controller;

import com.hevlar.queue.broadbandqueue.external.QueueProvider;
import com.hevlar.queue.broadbandqueue.model.BroadbandQueue;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BroadbandQueueController {

    private final QueueProvider queueProvider;

    public BroadbandQueueController(QueueProvider queueProvider){
        this.queueProvider = queueProvider;
    }

    @RequestMapping("/queue/{mobileNo}")
    public BroadbandQueue registerQueue(@PathVariable @NonNull String mobileNo){
        return new BroadbandQueue(mobileNo, queueProvider.getQueue());
    }
}
