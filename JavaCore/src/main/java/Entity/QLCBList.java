package Entity;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class QLCBList {
    private Scanner scanner = new Scanner(System.in);
    private List<CanBo> canBoList = new LinkedList<>();

    public void showMenu() {
        while (true) {
            System.out.println("1. Thêm cán bộ");
            System.out.println("2. Tìm kiếm cán bộ theo họ tên");
            System.out.println("3. Hiển thị danh sách cán bộ");
            System.out.println("4. Xóa cán bộ theo tên");
            System.out.println("5. Thoát chương trình");
            System.out.println("Mời bạn chọn chức năng:");
            int menu = Integer.parseInt(scanner.nextLine());
            if (menu == 1) {
                themCanBo();
            } else if (menu == 2) {
                timKiemTheoHoTen();
            } else if (menu == 3) {
                hienThiDSCB();
            } else if (menu == 4) {
                xoaTheoTen();
            } else if (menu == 5) {
                return;
            } else {
                System.out.println("Nhập lại");
            }
        }
    }

    private void xoaTheoTen() {
        System.out.println("Nhập vào tên:");
        String ten = scanner.nextLine();
        Predicate<CanBo> predicate = new Predicate<CanBo>() {
            @Override
            public boolean test(CanBo canBo) {
                int lastIndexOf = canBo.hoTen.lastIndexOf(' ');
                String tenCanBo = canBo.hoTen.substring(lastIndexOf + 1);
                return tenCanBo.equals(ten);
            }
        };
        canBoList.removeIf(predicate);
    }

    private void hienThiDSCB() {
        for (CanBo canBo : canBoList) {
            System.out.println(canBo);
        }
    }

    private void timKiemTheoHoTen() {
        String hoTen = nhapVaoHoTen();
        for (CanBo canBo : canBoList) {
            if (canBo.hoTen.equals(hoTen)) {
                System.out.println(canBo);
            }
        }
    }

    private void themCanBo() {
        System.out.println("1. Công nhân");
        System.out.println("2. Kỹ sư");
        System.out.println("3. Nhân viên");
        System.out.println("Chọn menu:");
        int menu = Integer.parseInt(scanner.nextLine());
        if (menu < 1 || menu > 3) return;
        String hoTen = nhapVaoHoTen();
        int tuoi = nhapVaoTuoi();
        GioiTinh gioiTinh = nhapVaoGioiTinh();
        String diaChi = nhapVaoDiaChi();
        if (menu == 1) {
            System.out.println("Nhập vào bậc:");
            int bac = Integer.parseInt(scanner.nextLine());
            CongNhan congNhan = new CongNhan(hoTen, tuoi, gioiTinh, diaChi, bac);
            canBoList.add(congNhan);
        } else if (menu == 2) {
            System.out.println("Nhập vào ngành đào tạo:");
            String nganhDaoTao = scanner.nextLine();
            KySu kySu = new KySu(hoTen, tuoi, gioiTinh, diaChi, nganhDaoTao);
            canBoList.add(kySu);
        } else {
            System.out.println("Nhập vào công việc:");
            String congViec = scanner.nextLine();
            NhanVien nhanVien = new NhanVien(hoTen, tuoi, gioiTinh, diaChi, congViec);
            canBoList.add(nhanVien);
        }
    }

    private String nhapVaoHoTen() {
        System.out.println("Nhập vào họ tên:");
        return scanner.nextLine();
    }

    private int nhapVaoTuoi() {
        System.out.println("Nhập vào tuổi:");
        return Integer.parseInt(scanner.nextLine());
    }

    private GioiTinh nhapVaoGioiTinh() {
        System.out.println("Chọn giới tính:");
        System.out.println("1. Nam");
        System.out.println("2. Nữ");
        System.out.println("3. Khác");
        String menu = scanner.nextLine();
        if (menu.equals("1")) {
            return GioiTinh.NAM;
        } else if (menu.equals("2")) {
            return GioiTinh.NU;
        }
        return GioiTinh.KHAC;
    }

    private String nhapVaoDiaChi() {
        System.out.println("Nhập vào địa chỉ:");
        return scanner.nextLine();
    }
}