package com.vti.controller;

import com.vti.entity.User;
import com.vti.service.IUserService;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class UserController {
    private IUserService iUserService;

    public List<User> findAllManager() {
        return iUserService.findAllManager();
    }

    public List<User> findEmployeeByProjectId(int projectId) {
        return iUserService.findEmployeeByProjectId(projectId);
    }


    public User findManagerByEmailAndPassword(String email, String password) {
        return iUserService.findManagerByEmailAndPassword(email, password);
    }

}
