package luyentap3;

public class Tinh {
    private String ma,ten,danSo;
    private double gDP;

    public Tinh() {
    }

    public Tinh(String ma, String ten, String danSo, double gDP) {
        this.ma = ma;
        this.ten = ten;
        this.danSo = danSo;
        this.gDP = gDP;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDanSo() {
        return danSo;
    }

    public void setDanSo(String danSo) {
        this.danSo = danSo;
    }

    public double getgDP() {
        return gDP;
    }

    public void setgDP(double gDP) {
        this.gDP = gDP;
    }

    @Override
    public String toString() {
        return "Tinh{" +
                "ma='" + ma + '\'' +
                ", ten='" + ten + '\'' +
                ", danSo='" + danSo + '\'' +
                ", gDP=" + gDP +
                '}';
    }
}
