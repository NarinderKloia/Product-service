package com.nav.relationships.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nav.relationships.Dto.UserDto;
import com.nav.relationships.Dto.createUserDto;
import com.nav.relationships.Services.userService;
import com.nav.relationships.Services.userServiceImpl;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("api/users")
@AllArgsConstructor
public class userController {
    private final  userService service;

    @PostMapping
    public UserDto createUser(@RequestBody createUserDto dto) {
        return service.saveUser(dto);

    }
}
