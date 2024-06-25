package com.vti.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtil {
    public static Connection getConnection() throws SQLException {
        String URL = "jdbc:mysql://localhost:3306/lesson_10";
        String user = "root";
        String pw = "123456";
        return DriverManager.getConnection(URL, user, pw);
    }

    public static void checkConnection() {
        try (Connection connection = getConnection()) {
            System.out.println("Kết nối thành công: connection = " + connection);
        }catch (SQLException e){
            System.err.println("Kết nối thất bại: e.getMessage() = " + e.getMessage());
        }
    }
}
