package com.vti.fronent;

import com.vti.repository.UserRepository;
import com.vti.util.JdbcUtil;

import java.sql.SQLException;

public class UserProgram {
    public static void main(String[] args) throws SQLException {
        JdbcUtil.checkConnection();
        UserRepository userRepository = new UserRepository();
        UserFunction function = new UserFunction(userRepository);
        function.showMenu();

    }
}
