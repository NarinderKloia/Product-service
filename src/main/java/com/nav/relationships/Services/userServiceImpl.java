package com.nav.relationships.Services;

import java.util.ArrayList;

import java.util.List;
import java.util.ArrayList;
import org.springframework.stereotype.Service;

import com.nav.relationships.Dto.UserDto;
import com.nav.relationships.Dto.createUserDto;
import com.nav.relationships.entity.user;
import com.nav.relationships.repositories.userRepo;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class userServiceImpl implements userService {

    private final userRepo repo;

    public UserDto saveUser(createUserDto dto) {
        user users = new user();
        users.setEmail(dto.getEmail());
        users.setName(dto.getName());
        user saveUser = repo.save(users);
        return new UserDto(saveUser.getId(),saveUser.getName(),saveUser.getEmail());
    }

    @Override
    public List<UserDto> getAllUsers(){
        List<user> users = repo.findAll();
        List<UserDto> userdtoList = new ArrayList<>();
        for(user user : users){
            UserDto userdto = new UserDto(user.getId(),user.getName(),user.getEmail());
            userdtoList.add(userdto);
        }
        return userdtoList;
    }
    
}
