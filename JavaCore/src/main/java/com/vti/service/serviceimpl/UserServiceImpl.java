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
    public List<User> findALl() {
        try {
            return userRepository.findALl();
        } catch (SQLException | IOException e) {
            return Collections.emptyList();
        }
    }

    @Override
    public User findById(int id) {
        try {
            return userRepository.findById(id);
        } catch (SQLException | IOException e) {
            return null;
        }
    }

    @Override
    public int create(String fullName, String email) {
        try {
            return userRepository.create(fullName, email);
        } catch (SQLException | IOException e) {
            return 0;
        }
    }

    @Override
    public int deleteById(int id) {
        try {
            return userRepository.deleteById(id);
        } catch (SQLException | IOException e) {
            return 0;
        }
    }

    @Override
    public User findByEmailAndPassword(String email, String password) {
        try {
            return userRepository.findByEmailAndPassword(email, password);
        } catch (SQLException | IOException e) {
            return null;
        }
    }
}
