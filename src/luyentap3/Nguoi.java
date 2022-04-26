package luyentap3;

public class Nguoi {
    private String ma,ten,tuoi,tinh;

    public Nguoi() {
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

    public String getTuoi() {
        return tuoi;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }

    public String getTinh() {
        return tinh;
    }

    public void setTinh(String tinh) {
        this.tinh = tinh;
    }

    @Override
    public String toString() {
        return "Nguoi{" +
                "ma='" + ma + '\'' +
                ", ten='" + ten + '\'' +
                ", tuoi='" + tuoi + '\'' +
                ", tinh='" + tinh + '\'' +
                '}';
    }
}
