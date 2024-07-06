package com.vti.service.serviceimpl;

import com.vti.entity.User;
import com.vti.repository.IUserRepository;
import com.vti.service.IUserService;
import lombok.AllArgsConstructor;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

@AllArgsConstructor
public class UserServiceImpl implements IUserService {

    private IUserRepository userRepository;

    @Override
    public List<User> findAllManager() {
        try {
            return userRepository.findAllManager();
        } catch (SQLException | IOException e) {
            return Collections.emptyList();
        }
    }

    @Override
    public List<User> findEmployeeByProjectId(int id) {
        try {
            return userRepository.findEmployeeByProjectId(id);
        } catch (SQLException | IOException e) {
            return null;
        }
    }


    @Override
    public User findManagerByEmailAndPassword(String email, String password) {
        try {
            return userRepository.findManagerByEmailAndPassword(email, password);
        } catch (SQLException | IOException e) {
            return null;
        }
    }
}
