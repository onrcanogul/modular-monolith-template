package com.example.demo.starter.auth.application.service;

import com.example.demo.starter.auth.application.dto.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.UUID;

public interface UserService extends UserDetailsService {
    UserDto getById(UUID userId);
    UUID getCurrentUserId();
}
