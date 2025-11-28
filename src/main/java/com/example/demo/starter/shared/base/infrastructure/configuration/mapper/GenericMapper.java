package com.example.demo.starter.shared.base.infrastructure.configuration.mapper;

public interface GenericMapper<E, D> {
    D toDto(E entity);
    E toEntity(D dto);
}
