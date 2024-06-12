package Entity;

public class KySu extends CanBo{
    private String nghanhdaotao;

    public KySu(String hoTen, int tuoi, GioiTinh gioiTinh, String diachi, String nghanhdaotao) {
        super(hoTen, tuoi, gioiTinh, diachi);
        this.nghanhdaotao = nghanhdaotao;
    }
}
