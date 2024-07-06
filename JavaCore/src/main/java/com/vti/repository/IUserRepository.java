package com.vti.repository;

import com.vti.entity.User;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface IUserRepository {
    /**
     * @return Tra ve danh sach Manager
     * */
    List<User> findAllManager() throws SQLException, IOException;
    /**
     * @return Tra ve danh sach Employee sau khi truyen vao projectId
     * @param projectId projectId cua User
     * */
    List<User> findEmployeeByProjectId(int projectId) throws SQLException, IOException;

    /**
     * Thong bao nguoi dung khi dang nhao dung
     * */
    User findManagerByEmailAndPassword(String email, String password) throws SQLException, IOException;
}
