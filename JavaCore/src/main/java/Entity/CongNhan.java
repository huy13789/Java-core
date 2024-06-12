package Entity;

public class CongNhan extends CanBo{
    private int bac;
    public CongNhan(String hoTen, int tuoi, GioiTinh gioiTinh, String diachi, int bac) {
        super(hoTen, tuoi, gioiTinh, diachi);
        this.bac = bac;
    }
}
