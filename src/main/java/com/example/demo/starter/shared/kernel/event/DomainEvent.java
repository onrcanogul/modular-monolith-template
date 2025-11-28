package com.example.demo.starter.shared.kernel.event;

import java.time.Instant;

public interface DomainEvent {
    default Instant occurredAt() {
        return Instant.now();
    }
}
