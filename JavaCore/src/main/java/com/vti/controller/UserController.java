package com.vti.controller;

import com.vti.entity.User;
import com.vti.service.IUserService;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class UserController {
    private IUserService iUserService;

    public List<User> findAll() {
        return iUserService.findALl();
    }

    public User findById(int id) {
        return iUserService.findById(id);
    }

    public int create(String fullName, String email) {
        return iUserService.create(fullName, email);
    }

    public int deleteById(int id) {
        return iUserService.deleteById(id);
    }

    public User findByEmailAndPassword(String email, String password) {
        return iUserService.findByEmailAndPassword(email, password);
    }

    ;
}
