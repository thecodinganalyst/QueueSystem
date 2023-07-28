package com.hevlar.queue.broadbandqueue.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("queue-provider")
public interface QueueProvider {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    Integer getQueue();
}
