package Entity;

public class NhanVien extends CanBo{
    private String congviec;

    public NhanVien(String hoTen, int tuoi, GioiTinh gioiTinh, String diachi, String congviec) {
        super(hoTen, tuoi, gioiTinh, diachi);
        this.congviec = congviec;
    }
}
