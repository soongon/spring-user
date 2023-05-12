package com.example.springuser.controller;

import com.example.springuser.model.User;
import com.example.springuser.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    public static final Logger log = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getUsers() {
        log.debug("로그입니다. ");
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
