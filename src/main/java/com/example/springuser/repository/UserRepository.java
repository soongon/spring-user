package com.example.springuser.repository;

import com.example.springuser.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserRepository {

    List<User> selectAllUsers();
    void insertUser(User user);
    User selectUserByUserId(int userId);

}
