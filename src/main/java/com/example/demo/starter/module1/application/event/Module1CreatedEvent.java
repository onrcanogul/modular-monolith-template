package com.example.demo.starter.module1.application.event;

import com.example.demo.starter.shared.kernel.event.DomainEvent;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter @Getter
@NoArgsConstructor @AllArgsConstructor
public class Module1CreatedEvent implements DomainEvent {
    private String name;
}

