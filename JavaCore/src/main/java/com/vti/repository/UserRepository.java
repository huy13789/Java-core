package com.vti.repository;

import com.vti.entity.User;
import com.vti.util.JdbcUtil;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class UserRepository {
    public List<User> findALl() throws SQLException {
        List<User> userList = new LinkedList<>();
        String sql = "SELECT * FROM users";
        try
                (
                        Connection connection = JdbcUtil.getConnection();
                        Statement statement = connection.createStatement();
                        ResultSet rs = statement.executeQuery(sql);
                ) {
            List<User> users = new LinkedList<>();
            while (rs.next()) {
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setFullName(rs.getString("full_name"));
                user.setEmail(rs.getString("email"));
                user.setPassword(rs.getString("password"));
                user.setRole(rs.getString("role"));
                user.setProSkill(rs.getString("pro_skill"));
                user.setExpInYear(rs.getInt("exp_in_year"));
                userList.add(user);
            }
        } catch (Exception e) {
            System.out.println("e.getMessage() = " + e.getMessage());
        }
        return userList;
    }

    public int create(String fullName, String email) throws SQLException {
        String sql = "INSERT INTO users(full_name, email) VALUES (?,?)";
        try (Connection connection = JdbcUtil.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ) {
            preparedStatement.setString(1, fullName);
            preparedStatement.setString(2, email);
            return preparedStatement.executeUpdate();
        }
    }
}
