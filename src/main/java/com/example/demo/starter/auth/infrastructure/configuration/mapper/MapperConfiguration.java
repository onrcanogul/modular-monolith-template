package com.example.demo.starter.auth.infrastructure.configuration.mapper;

import com.example.demo.starter.auth.application.dto.UserDto;
import com.example.demo.starter.auth.entity.User;
import com.example.demo.starter.shared.base.dto.BaseDto;
import com.example.demo.starter.shared.base.entity.BaseEntity;
import com.example.demo.starter.shared.base.infrastructure.configuration.mapper.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfiguration {

    @Bean
    public Mapper<BaseEntity, BaseDto> baseMapper() {
        return new Mapper<>(BaseEntity.class, BaseDto.class);
    }
    @Bean
    public Mapper<User, UserDto> userMapper() { return new Mapper<>(User.class, UserDto.class); }
}
