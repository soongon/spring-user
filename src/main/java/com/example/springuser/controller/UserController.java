package com.example.springuser.controller;

import com.example.springuser.model.User;
import com.example.springuser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getUsers() {
        // 사용자 목록을 반환하는 서비스를 호출
        return userService.getAllUsers();
    }

    @PostMapping("/users")
    public void registUser(@RequestBody User user) {
        userService.registUser(user);
    }

    @GetMapping("/users/{userId}")
    public User findUserByUserId(@PathVariable int userId) {
        return userService.findUserByUserId(userId);
    }
}
