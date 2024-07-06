package com.vti.repository;

import com.vti.entity.User;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface IUserRepository {

    List<User> findAllManager() throws SQLException, IOException;

    List<User> findEmployeeByProjectId(int id) throws SQLException, IOException;

    User findManagerByEmailAndPassword(String email, String password) throws SQLException, IOException;
}
