package com.example.demo.starter.auth.application.handler;

import com.example.demo.starter.auth.application.event.Module1CreatedEvent;
import com.example.demo.starter.shared.kernel.event.DomainEventHandler;
import org.springframework.context.event.EventListener;

public class Module1EntityCreatedEventHandler implements DomainEventHandler<Module1CreatedEvent> {
    @Override
    @EventListener
    public void handle(Module1CreatedEvent event) {

    }
}
