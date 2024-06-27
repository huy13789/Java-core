package com.vti.fronent;

import com.vti.entity.User;
import com.vti.repository.UserRepository;
import com.vti.util.JdbcUtil;
import com.vti.util.ScannerUtil;
import lombok.AllArgsConstructor;

import java.sql.SQLException;
import java.util.List;

@AllArgsConstructor
public class UserFunction {
    private UserRepository userRepository;

    public void showMenu() throws SQLException {
        while (true) {
            System.out.println("1 . Dang nhap");
            System.out.println("2 . Danh sach nguoi dung");
            System.out.println("3 . Them nguoi dung");
            System.out.println("4 . Tim khien theo id");
            System.out.println("5 . Xoa user theo id");
            System.out.println("6 . Thoat");
            System.out.println("Chon chuc nang");
            int menu = ScannerUtil.InputInt();
            if (menu == 1) {
                findAll();
            }else if (menu == 2) {
                findAll();
            } else if (menu == 3) {
                create();
            } else if (menu == 4) {
                findByID();
            } else if (menu == 5) {
                deleteById();
            } else if (menu == 6) {
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

    private void findByID() throws SQLException {
        System.out.println("Nhap id can tim");
        int id = ScannerUtil.InputInt();
        User user = userRepository.findById(id);
        System.out.println("+------+-------------------------+-------------------------+");
        System.out.printf("| %-4s | %-23s | %-23s |%n", "ID", "FULL NAME", "EMAIL");
        System.out.println("+------+-------------------------+-------------------------+");
        if (user == null) {
            System.out.printf("| %-4s | %-23s | %-23s |%n", "null", "null", "null");
            System.out.println("+------+-------------------------+-------------------------+");
        } else {
            System.out.printf(
                    "| %-4s | %-23s | %-23s |%n",
                    user.getId(), user.getFullName(), user.getEmail()
            );
            System.out.println("+------+-------------------------+-------------------------+");
        }
    }
    private void deleteById() throws SQLException {
        System.out.println("Nhap id muon xoa ");
        int id = ScannerUtil.InputInt();
        int result = userRepository.deleteById(id);
        System.out.println("Xoa thanh cong user: " + result);
    }
}
