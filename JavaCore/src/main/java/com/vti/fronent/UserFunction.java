package com.vti.fronent;

import com.vti.controller.UserController;
import com.vti.entity.User;
import com.vti.util.ScannerUtil;
import lombok.AllArgsConstructor;
import java.util.List;

@AllArgsConstructor
public class UserFunction {
    private UserController userController;

    public void showMenu()  {
        while (true) {
            System.out.println("1. Đăng nhập");
            System.out.println("2. Hiển thị danh sách user");
            System.out.println("3. Tìm kiếm user theo id");
            System.out.println("4. Thoát chương trình");
            System.out.println("Mời bạn chọn chức năng:");
            int menu = ScannerUtil.inputInt();
            if (menu == 1) {
                findByEmailAndPassword();
            } else if (menu == 2) {
                findAll();
            } else if (menu == 3) {
                findById();
            } else if (menu == 4) {
                System.out.println("Cảm ơn bạn đã sử dụng chương trình!");
                return;
            } else {
                System.err.println("Vui lòng chọn đúng chức năng.");
            }
        }
    }

    private void showAdminMenu()  {
        while (true) {
            System.out.println("1. Hiển thị danh sách user");
            System.out.println("2. Tìm kiếm user theo id");
            System.out.println("3. Thêm user");
            System.out.println("4. Xóa user theo id");
            System.out.println("5. Đăng xuất");
            System.out.println("Mời bạn chọn chức năng:");
            int menu = ScannerUtil.inputInt();
            if (menu == 1) {
                findAll();
            } else if (menu == 2) {
                findById();
            } else if (menu == 3) {
                create();
            } else if (menu == 4) {
                deleteById();
            } else if (menu == 5) {
                System.out.println("Đăng xuất thành công!");
                return;
            } else {
                System.err.println("Vui lòng chọn đúng chức năng.");
            }
        }
    }

    private void showEmployeeMenu()  {
        while (true) {
            System.out.println("1. Hiển thị danh sách user");
            System.out.println("2. Tìm kiếm user theo id");
            System.out.println("3. Đăng xuất");
            System.out.println("Mời bạn chọn chức năng:");
            int menu = ScannerUtil.inputInt();
            if (menu == 1) {
                findAll();
            } else if (menu == 2) {
                findById();
            } else if (menu == 3) {
                System.out.println("Đăng xuất thành công!");
                return;
            } else {
                System.err.println("Vui lòng chọn đúng chức năng.");
            }
        }
    }

    private void findAll()  {
        List<User> users = userController.findAll();
        System.out.println("+------+-------------------------+-------------------------+");
        System.out.printf("| %-4s | %-23s | %-23s |%n", "ID", "FULL NAME", "EMAIL");
        System.out.println("+------+-------------------------+-------------------------+");
        if (users.isEmpty()) {
            System.out.printf("| %-4s | %-23s | %-23s |%n", "NULL", "NULL", "NULL");
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

    private void findById()  {
        System.out.println("Nhập vào id:");
        int id = ScannerUtil.inputInt();
        User user = userController.findById(id);
        System.out.println("+------+-------------------------+-------------------------+");
        System.out.printf("| %-4s | %-23s | %-23s |%n", "ID", "FULL NAME", "EMAIL");
        System.out.println("+------+-------------------------+-------------------------+");
        if (user == null) {
            System.out.printf("| %-4s | %-23s | %-23s |%n", "NULL", "NULL", "NULL");
            System.out.println("+------+-------------------------+-------------------------+");
        } else {
            System.out.printf(
                    "| %-4s | %-23s | %-23s |%n",
                    user.getId(), user.getFullName(), user.getEmail()
            );
            System.out.println("+------+-------------------------+-------------------------+");
        }
    }

    private void findByEmailAndPassword()  {
        System.out.println("Nhập vào email:");
        String email = ScannerUtil.inputEmail();
        System.out.println("Nhập vào password:");
        String password = ScannerUtil.inputPassword();
        User user = userController.findByEmailAndPassword(email, password);
        if (user == null) {
            System.err.println("Đăng nhập thất bại!");
        } else {
            User.Role role = user.getRole();
            System.out.printf(
                    "Đăng nhập thành công: %s - %s%n",
                    user.getFullName(), role
            );
            if (role == User.Role.ADMIN) {
                showAdminMenu();
            } else if (role == User.Role.EMPLOYEE) {
                showEmployeeMenu();
            }
        }
    }

    private void create()  {
        System.out.println("Mời bạn nhập vào thông tin user.");
        System.out.println("Nhập vào full name:");
        String fullName = ScannerUtil.inputFullName();
        System.out.println("Nhập vào email:");
        String email = ScannerUtil.inputEmail();
        int result = userController.create(fullName, email);
        System.out.printf("Đã tạo thành công %d user.%n", result);
    }

    private void deleteById()  {
        System.out.println("Nhập vào id:");
        int id = ScannerUtil.inputInt();
        int result = userController.deleteById(id);
        System.out.printf("Đã xóa thành công %d user.%n", result);
    }
}