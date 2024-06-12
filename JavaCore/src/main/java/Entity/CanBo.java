package Entity;

import java.util.Objects;

public class CanBo {
    private String hoTen;
    private int tuoi;
    private GioiTinh gioiTinh;
    private String diachi;

    public CanBo() {
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public GioiTinh getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(GioiTinh gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public CanBo(String hoTen, int tuoi, GioiTinh gioiTinh, String diachi) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.diachi = diachi;
    }

    @Override
    public String toString() {
        return "CanBo{" +
                "hoTen='" + hoTen + '\'' +
                ", tuoi=" + tuoi +
                ", gioiTinh=" + gioiTinh +
                ", diachi='" + diachi + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CanBo)) return false;
        CanBo canBo = (CanBo) o;
        return this.hoTen != null && this.hoTen.equalsIgnoreCase(canBo.hoTen);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hoTen, tuoi, gioiTinh, diachi);
    }
}
