package com.example.dns.dnsapp.springevent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class FileEventPublisher {
    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void notifyComplete(FileEvent fileEvent){
        applicationEventPublisher.publishEvent(fileEvent);
    }

    public void notifyError(FileEvent fileEvent){
        applicationEventPublisher.publishEvent(fileEvent);
    }
}
