package com.example.demo.controllers;

import com.example.demo.dto.UserDto;
import com.example.demo.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {

  private final UserService userService;

  public RegisterController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping(value = "/register")
  public String registerPage(Model model) {
    return "register";
  }

  @PostMapping("/register")
  public String register(@ModelAttribute("user") UserDto user, Model model) {
    System.out.println(user.toString());
    UserDto userDto = userService.saveUser(user);
    model.addAttribute("user", userDto);
    return "home";
  }
}
