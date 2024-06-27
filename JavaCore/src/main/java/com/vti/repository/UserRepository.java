package com.vti.repository;

import com.vti.entity.User;
import com.vti.util.JdbcUtil;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class UserRepository {
    public List<User> findALl() throws SQLException {
        String sql = "SELECT * FROM users";
        try
                (
                        Connection connection = JdbcUtil.getConnection();
                        Statement statement = connection.createStatement();
                        ResultSet rs = statement.executeQuery(sql);

                ) {
            List<User> users = new LinkedList<>();
            while (rs.next()) {
                User user = getUser(rs);
                users.add(user);
            }
            return users;
        } catch (Exception e) {
            System.out.println("e.getMessage() = " + e.getMessage());
            return new LinkedList<>();
        }
    }

    public User findById(int id) throws SQLException {
        String sql = "SELECT * FROM users WHERE id = ?";
        try (
                Connection connection = JdbcUtil.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ) {
            preparedStatement.setInt(1, id);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                return resultSet.next() ? getUser(resultSet) : null;
            }
        }
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

    public int deleteById(int id) throws SQLException {
        String sql = "DELETE FROM users WHERE id = ?";
        try (
                Connection connection = JdbcUtil.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ) {
            preparedStatement.setInt(1, id);
            return preparedStatement.executeUpdate();
        }
    }

    public User findByEmailAndPassword(String email, String password) throws SQLException {
        String sql = "{CALL find_by_email_and_password(?, ?)}";
        try (
                Connection connection = JdbcUtil.getConnection();
                CallableStatement cStmt = connection.prepareCall(sql)
        ) {
            cStmt.setString(1, email);
            cStmt.setString(2, password);
            try (ResultSet rs = cStmt.executeQuery()) {
                return rs.next() ? getUser(rs) : null;
            }
        }
    }

    private User getUser(ResultSet rs) throws SQLException {
        User user = new User();
        user.setId(rs.getInt("id"));
        user.setFullName(rs.getString("full_name"));
        user.setEmail(rs.getString("email"));
        user.setPassword(rs.getString("password"));
        user.setRole(rs.getString("role"));
        user.setProSkill(rs.getString("pro_skill"));
        user.setExpInYear(rs.getInt("exp_in_year"));
        return user;
    }
}
