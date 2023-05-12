package com.example.springuser.model;

public class User {
    private int userId;
    private String name;
    private int age;

    public User() {}

    public User(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
