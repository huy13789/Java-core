package com.vti.fronent;

import com.vti.entity.User;
import com.vti.repository.UserRepository;
import com.vti.util.ScannerUtil;
import lombok.AllArgsConstructor;

import java.sql.SQLException;
import java.util.List;

@AllArgsConstructor
public class UserFunction {
    private UserRepository userRepository;

    public void showMenu() throws SQLException {
        while (true) {
            System.out.println("1 . Danh sach nguoi dung");
            System.out.println("2 . Them nguoi dung");
            System.out.println("2 . Thoat");
            System.out.println("Chon chuc nang");
            int menu = ScannerUtil.InputIne();
            if (menu == 1) {
                findAll();
            } else if (menu == 2) {
                create();
            } else if (menu == 3) {
                return;
            } else {
                System.out.println("Chon dung chuc nang");
            }
        }
    }

    private void findAll() throws SQLException {
        List<User> users = userRepository.findALl();
        System.out.println("+------+-------------------------+-------------------------+");
        System.out.printf("| %-4s | %-23s | %-23s |%n", "ID", "FULL NAME", "EMAIL");
        System.out.println("+------+-------------------------+-------------------------+");
        if (users.isEmpty()) {
            System.out.printf("| %-4s | %-23s | %-23s |%n", "null", "null", "null");
            System.out.println("+------+-------------------------+-------------------------+");
        } else {
            for (User user : users) {
                System.out.printf(
                        "| %-4s | %-23s | %-23s |%n",
                        user.getId(), user.getFullName(), user.getEmail()
                );
                System.out.println("+------+-------------------------+-------------------------+");
            }
        }
    }

    private void create() throws SQLException {
        System.out.println("Moi nhap vao thong tin user.");
        System.out.println("Moi nhap vao full name: ");
        String fullName = ScannerUtil.InputFullName();
        System.out.println("Nhap vao email");
        String email = ScannerUtil.InputEmail();
        int result = userRepository.create(fullName, email);
        System.out.printf("Da tao thenh cong user: %d \n", result);
    }
}
