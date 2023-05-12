package com.example.springuser.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    // 사용자 전제를 조회하는 기능
    public String getAllUsers() {
        return "전체 사용자 목록 입니다. from service..";
    }
}
