package com.nav.relationships.Services;

import java.util.List;

import com.nav.relationships.Dto.UserDto;
import com.nav.relationships.Dto.createUserDto;

public interface userService{
     UserDto saveUser(createUserDto dto);
     public List<UserDto> getAllUsers();
}
