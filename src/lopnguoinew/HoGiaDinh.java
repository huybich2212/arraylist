package lopnguoinew;

import java.util.ArrayList;

public class HoGiaDinh implements Comparable<HoGiaDinh> {
    private final ArrayList<Nguoi> giaDinh = new ArrayList<>();
    private String diaChi;
    private int soThanhVien;

    public HoGiaDinh() {
        this.diaChi = diaChi;
        this.soThanhVien = soThanhVien;
    }

    public ArrayList<Nguoi> getGiaDinh() {
        return giaDinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getSoThanhVien() {
        return soThanhVien;
    }

    public void setSoThanhVien(int soThanhVien) {
        this.soThanhVien = soThanhVien;
    }

    public void add(Nguoi nguoi) {
        this.giaDinh.add(nguoi);
        soThanhVien++;

    }

    public void display() {
        for (int i = 0; i < giaDinh.size(); i++) {
            System.out.println(this.giaDinh.get(i).toString());

        }
        System.out.println("địa chỉ " + getDiaChi() + "số thành viên" + soThanhVien);

    }

    public boolean xoa(Nguoi nguoi) {
        return this.giaDinh.remove(nguoi);
    }

    public void timNguoi(String hoTen) {
        for (Nguoi nguoi : giaDinh) {
            if (nguoi.getHoTen().indexOf(hoTen) > 0) {
                System.out.println(nguoi);
            }
        }


    }

    @Override
    public String toString() {
        return "HoGiaDinh{" +
                "giaDinh=" + giaDinh +
                ", diaChi='" + diaChi + '\'' +
                ", soThanhVien=" + soThanhVien +
                '}';
    }

    @Override
    public int compareTo(HoGiaDinh o) {
        return 0;
    }
}