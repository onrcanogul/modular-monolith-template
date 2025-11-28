package com.example.demo.starter.shared.kernel.event;

public interface DomainEventHandler<T extends DomainEvent> {
    void handle(T event);
}