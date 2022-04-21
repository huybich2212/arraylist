package luyentap;

public class KySu  extends CanBo{
    private String nghanhDaoTao;

    public KySu(String hoTen, int tuoi, String gioiTinh, String diaChi, String nghanhDaoTao) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.nghanhDaoTao = nghanhDaoTao;
    }

    public String getNghanhDaoTao() {
        return nghanhDaoTao;
    }

    public void setNghanhDaoTao(String nghanhDaoTao) {
        this.nghanhDaoTao = nghanhDaoTao;
    }

    @Override
    public String toString() {
        return super.toString()+ "KySu{" +
                "nghanhDaoTao='" + nghanhDaoTao + '\'' +
                '}';
    }
}
