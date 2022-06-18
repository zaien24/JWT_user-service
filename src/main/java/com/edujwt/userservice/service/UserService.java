package com.edujwt.userservice.service;

import com.edujwt.userservice.dto.UserDto;
import com.edujwt.userservice.jpa.UserEntity;

public interface UserService {
    UserDto createUser(UserDto userDto);

    UserDto getUserByUserId(String userId);
    Iterable<UserEntity> getUserByAll();
}
