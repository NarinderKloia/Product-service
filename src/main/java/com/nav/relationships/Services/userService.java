package com.nav.relationships.Services;

import com.nav.relationships.Dto.UserDto;
import com.nav.relationships.Dto.createUserDto;

public interface userService{
     UserDto saveUser(createUserDto dto);
}
