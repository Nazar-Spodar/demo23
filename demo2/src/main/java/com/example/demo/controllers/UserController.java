package com.example.demo.controllers;

import com.example.demo.dto.UserDto;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Controller
public class UserController {

  @Autowired
  private UserService userService;

  @GetMapping(value = "/users")
  public String getAllUser(Model model) {
    List<UserDto> allUsers = userService.getAllUsers();
    model.addAttribute("users", allUsers);
    return "users";
  }

}
