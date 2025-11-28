package com.example.demo.starter.shared.kernel.event;

import java.util.List;

public interface DomainEventPublisher {
    void publish(DomainEvent event);
    void publishAll(List<DomainEvent> events);
}
