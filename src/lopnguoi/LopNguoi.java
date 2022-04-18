package lopnguoi;

public class LopNguoi {
    private String ten;
    private String nghe;
    private int tuoi;
    private int cmnd;

    public LopNguoi(String ten,String nghe,int tuoi,int cmnd) {
        this.ten = ten;
        this.nghe = nghe;
        this.tuoi = tuoi;
        this.cmnd = cmnd;

    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNghe() {
        return nghe;
    }

    public void setNghe(String nghe) {
        this.nghe = nghe;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getCmnd() {
        return cmnd;
    }

    public void setCmnd(int cmnd) {
        this.cmnd = cmnd;
    }

    @Override
    public String toString() {
        return "LopNguoi{" +
                "ten='" + ten + '\'' +
                ", nghe='" + nghe + '\'' +
                ", tuoi=" + tuoi +
                ", cmnd=" + cmnd +
                '}';
    }
}
