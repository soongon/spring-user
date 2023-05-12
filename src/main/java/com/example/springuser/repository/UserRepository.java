package com.example.springuser.repository;

import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository {

    String selectAllUsers();
}
