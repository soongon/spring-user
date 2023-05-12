package com.example.springuser.service;

import com.example.springuser.model.User;
import com.example.springuser.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // 사용자 전제를 조회하는 기능
    public List<User> getAllUsers() {
        return userRepository.selectAllUsers();
    }

    public void registUser(User user) {
        userRepository.insertUser(user);
    }

    public User findUserByUserId(int userId) {
        return userRepository.selectUserByUserId(userId);
    }
}
