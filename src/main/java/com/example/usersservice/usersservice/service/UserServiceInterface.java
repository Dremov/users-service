package com.example.usersservice.usersservice.service;

import com.example.usersservice.usersservice.shared.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserServiceInterface extends UserDetailsService {
    UserDto createUser(UserDto userDetails);
}
