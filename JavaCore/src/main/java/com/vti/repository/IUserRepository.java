package com.vti.repository;

import com.vti.entity.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserRepository {
    /***
     * @return Trả về tất cả user trong DB
     * @throws SQLException nếu xảy ra lỗi SQL
     */
    List<User> findALl() throws SQLException;

    /**
     * @param id
     * @return
     * @throws SQLException nếu xảy ra lỗi SQL
     */
    User findById(int id) throws SQLException;

    int create(String fullName, String email) throws SQLException;

    int deleteById(int id) throws SQLException;

    User findByEmailAndPassword(String email, String password) throws SQLException;
}
