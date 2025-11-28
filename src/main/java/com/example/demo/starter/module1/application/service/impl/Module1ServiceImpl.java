package com.example.demo.starter.module1.application.service.impl;


import com.example.demo.starter.module1.application.dto.Module1Dto;
import com.example.demo.starter.module1.application.service.Module1Service;
import com.example.demo.starter.module1.entity.Module1Entity;
import com.example.demo.starter.shared.base.infrastructure.configuration.mapper.Mapper;
import com.example.demo.starter.shared.base.repository.BaseRepository;
import com.example.demo.starter.shared.base.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class Module1ServiceImpl extends BaseServiceImpl<Module1Entity, Module1Dto> implements Module1Service {
    public Module1ServiceImpl(
            BaseRepository<Module1Entity> repository,
            Mapper<Module1Entity, Module1Dto> mapper
    ) {
        super(repository, mapper);
    }

    @Override
    protected void updateEntity(Module1Dto dto, Module1Entity entity) {
        entity.setName(dto.getName());
    }
}
