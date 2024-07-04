package com.vti.fronent;

import com.vti.controller.UserController;
import com.vti.repository.UserRepository;
import com.vti.service.serviceimpl.UserServiceImpl;

public class UserProgram {
    public static void main(String[] args){
        UserRepository userRepository = new UserRepository();
        UserServiceImpl userService = new UserServiceImpl(userRepository);
        UserController userController = new UserController(userService);
        UserFunction function = new UserFunction(userController);
        function.showMenu();

    }
}
