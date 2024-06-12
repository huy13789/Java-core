package Entity;

import java.util.Scanner;

public class QLCB {
    private CanBo[] danhSachCanBo;
    private int soLuongCanBo;

    public QLCB() {
        danhSachCanBo = new CanBo[1];
        soLuongCanBo = 0;
    }

    //Thêm mới cán bộ
    public void themCanBo(CanBo canBo) {
        if (soLuongCanBo >= danhSachCanBo.length) {
            CanBo[] newDanhSachCanBo = new CanBo[danhSachCanBo.length * 2];
            System.arraycopy(danhSachCanBo, 0, newDanhSachCanBo, 0, danhSachCanBo.length);
            danhSachCanBo = newDanhSachCanBo;
        }

        danhSachCanBo[soLuongCanBo++] = canBo;
    }

    //Tìm kiếm theo họ tên
    public CanBo timKiemTheoHoTen(String hoTen) {
        for (int i = 0; i < soLuongCanBo; i++) {
            if (danhSachCanBo[i].getHoTen().equalsIgnoreCase(hoTen)) {
                return danhSachCanBo[i];
            }
        }
        return null;
    }

    //Hiển thị thông tin về danh sách các cán bộ
    public void hienThiDanhSach() {
        if (soLuongCanBo == 0) {
            System.out.println("Danh sách cán bộ trống.");
        } else {
            for (int i = 0; i < soLuongCanBo; i++) {
                System.out.println(danhSachCanBo[i]);
            }
        }
    }

    //Nhập vào tên của cán bộ và xóa cán bộ đó
    public boolean xoaCanBo(String hoTen) {
        for (int i = 0; i < soLuongCanBo; i++) {
            if (danhSachCanBo[i].getHoTen().equalsIgnoreCase(hoTen)) {
                for (int j = i; j < soLuongCanBo - 1; j++) {
                    danhSachCanBo[j] = danhSachCanBo[j + 1];
                }
                danhSachCanBo[--soLuongCanBo] = null;
                return true;
            }
        }
        return false;
    }

    //Thoát khỏi chương trình
    public void thoatChuongTrinh() {
        System.out.println("Thoát chương trình...");
        System.exit(0);
    }

    // Tạo menu
    public void menu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Thêm mới cán bộ");
            System.out.println("2. Tìm kiếm theo họ tên");
            System.out.println("3. Hiển thị danh sách cán bộ");
            System.out.println("4. Xóa cán bộ theo họ tên");
            System.out.println("5. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Nhập họ tên: ");
                    String hoTen = scanner.nextLine();
                    System.out.print("Nhập tuổi: ");
                    int tuoi = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    System.out.print("Nhập giới tính: ");
                    String gioiTinhStr = scanner.nextLine();
                    GioiTinh gioiTinh = GioiTinh.valueOf(gioiTinhStr);
                    System.out.print("Nhập địa chỉ: ");
                    String diaChi = scanner.nextLine();
                    CanBo canBo = new CanBo(hoTen, tuoi, gioiTinh, diaChi);
                    themCanBo(canBo);
                    System.out.println("Thêm cán bộ thành công.");
                    break;
                case 2:
                    System.out.print("Nhập họ tên để tìm kiếm: ");
                    hoTen = scanner.nextLine();
                    CanBo foundCanBo = timKiemTheoHoTen(hoTen);
                    if (foundCanBo != null) {
                        System.out.println("Thông tin cán bộ: " + foundCanBo);
                    } else {
                        System.out.println("Không tìm thấy cán bộ.");
                    }
                    break;
                case 3:
                    hienThiDanhSach();
                    break;
                case 4:
                    System.out.print("Nhập họ tên để xóa: ");
                    hoTen = scanner.nextLine();
                    boolean isDeleted = xoaCanBo(hoTen);
                    if (isDeleted) {
                        System.out.println("Xóa cán bộ thành công.");
                    } else {
                        System.out.println("Không tìm thấy cán bộ.");
                    }
                    break;
                case 5:
                    thoatChuongTrinh();
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }
}
