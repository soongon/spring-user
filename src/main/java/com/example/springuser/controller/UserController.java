package com.example.springuser.controller;

import com.example.springuser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public String getUsers() {
        // 사용자 목록을 반환하는 서비스를 호출
        return userService.getAllUsers();
    }
}
