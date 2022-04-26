package lopnguoinew;

public class Nguoi {
    private String hoTen;
    private int tuoi;
    private String ngheNghiep;
    private int cmnd;


    public Nguoi(String hoTen, int tuoi, String ngheNghiep, int cmnd) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.ngheNghiep = ngheNghiep;
        this.cmnd = cmnd;
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

    public String getNgheNghiep() {
        return ngheNghiep;
    }

    public void setNgheNghiep(String ngheNghiep) {
        this.ngheNghiep = ngheNghiep;
    }

    public int getCmnd() {
        return cmnd;
    }

    public void setCmnd(int cmnd) {
        this.cmnd = cmnd;
    }

    @Override
    public String toString() {
        return "Nguoi{" +
                "hoTen='" + hoTen + '\'' +
                ", tuoi=" + tuoi +
                ", ngheNghiep='" + ngheNghiep + '\'' +
                ", cmnd=" + cmnd +
                '}';
    }
}
