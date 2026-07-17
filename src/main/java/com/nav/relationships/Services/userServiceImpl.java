package com.nav.relationships.Services;

import org.springframework.stereotype.Service;

import com.nav.relationships.Dto.createUserDto;
import com.nav.relationships.entity.user;
import com.nav.relationships.repositories.userRepo;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class userServiceImpl implements userService {

    private final userRepo repo;

    @Override
    public createUserDto createUser() {

    }
    
}
