package exercise01;

public class ThiSinhKhoiB extends ThiSinh {
    public ThiSinhKhoiB(int soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
    }

    @Override
    public String monThi() {
        return "Toán, Hoá, Sinh";
    }
}