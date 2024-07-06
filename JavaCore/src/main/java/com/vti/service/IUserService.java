package com.vti.service;

import com.vti.entity.User;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface IUserService{
    List<User> findAllManager();

    List<User> findEmployeeByProjectId(int id);

    User findManagerByEmailAndPassword(String email, String password);
}
