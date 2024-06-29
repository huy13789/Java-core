package com.vti.repository;

import com.vti.entity.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserRepository {
    List<User> findALl() throws SQLException;

    User findById(int id) throws SQLException;

    int create(String fullName, String email) throws SQLException;

    int deleteById(int id) throws SQLException;

    User findByEmailAndPassword(String email, String password) throws SQLException;
}
