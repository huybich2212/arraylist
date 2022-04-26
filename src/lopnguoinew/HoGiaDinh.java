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

    public void xoa(String hoTen) {
        int indexOf=timNguoi(hoTen);
        if(indexOf==-1){
            System.out.println("ko có trong danh sách");
        }
        else {
            this.giaDinh.remove(indexOf);
            soThanhVien--;
        }

     }


    public int timNguoi(String hoTen) {
        for (int i = 0; i < giaDinh.size(); i++) {
            if(giaDinh.get(i).getHoTen().equals(hoTen)) {
                return i;
            }

        }
        return -1;
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