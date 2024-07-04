package com.vti.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcUtil {
    public static Connection getConnection() throws SQLException, IOException {
        String path = "src/main/resources/database.properties";
        try (FileInputStream fis = new FileInputStream(path)){
            Properties properties = new Properties();
            properties.load(fis);
            String url = properties.getProperty("url");
            String user = properties.getProperty("user");
            String pw = properties.getProperty("password");
            return DriverManager.getConnection(url, user, pw);
        }
    }

    public static void checkConnection() {
        try (Connection connection = getConnection()) {
            System.out.println("Kết nối thành công: connection = " + connection);
        }catch (SQLException | IOException e){
            System.err.println("Kết nối thất bại: e.getMessage() = " + e.getMessage());
        }
    }
}
