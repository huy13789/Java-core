package com.vti.service;

import com.vti.entity.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserService{
    List<User> findALl() ;

    User findById(int id) ;

    int create(String fullName, String email) ;

    int deleteById(int id) ;

    User findByEmailAndPassword(String email, String password) ;
}
