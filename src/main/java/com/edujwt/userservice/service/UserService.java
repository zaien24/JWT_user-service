package com.edujwt.userservice.service;

import com.edujwt.userservice.dto.UserDto;

public interface UserService {
    UserDto createUser(UserDto userDto);
}
