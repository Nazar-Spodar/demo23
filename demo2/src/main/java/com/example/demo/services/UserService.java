package com.example.demo.services;

import com.example.demo.dto.UserDto;

import java.util.List;

public interface UserService {

  UserDto saveUser(UserDto user);

  List<UserDto> getAllUsers();

}
