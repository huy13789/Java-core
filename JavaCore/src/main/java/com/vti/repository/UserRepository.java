package com.vti.repository;

import com.vti.entity.User;
import com.vti.util.JdbcUtil;

import java.io.IOException;
import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class UserRepository implements IUserRepository {
    @Override
    public List<User> findAllManager() throws SQLException, IOException {
        String sql = "SELECT * FROM users WHERE role = 'MANAGER'";
        try
                (
                        Connection connection = JdbcUtil.getConnection();
                        Statement statement = connection.createStatement();
                        ResultSet rs = statement.executeQuery(sql)

                ) {
            List<User> users = new LinkedList<>();
            while (rs.next()) {
                User user = getUser(rs);
                users.add(user);
            }
            return users;
        }
    }
//findManager
    //
    @Override
    public List<User> findEmployeeByProjectId(int projectId) throws SQLException, IOException {
        String sql = "SELECT * FROM users WHERE role = 'EMPLOYEE' AND project_id = ?";
        try (
                Connection connection = JdbcUtil.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(sql)
        ) {
            preparedStatement.setInt(1, projectId);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                List<User> users = new LinkedList<>();
                while (resultSet.next()) {
                    User user = getUser(resultSet);
                    users.add(user);
                }
                return users;
            }
        }
    }

    @Override
    public User findManagerByEmailAndPassword(String email, String password) throws SQLException, IOException {
        String sql = "{CALL find_manager_by_email_and_password(?, ?)}";
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
        user.setProjectId(rs.getInt("project_id"));
        user.setExpInYear(rs.getInt("exp_in_year"));
        return user;
    }
}
