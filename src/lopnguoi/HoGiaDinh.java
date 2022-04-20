package lopnguoi;

import java.util.ArrayList;

public class HoGiaDinh implements Comparable<HoGiaDinh> {
    private String diaChi;
    private int soNguoi;
    private ArrayList<LopNguoi> giaDinh;

    public HoGiaDinh(String diachi, int songuoi) {
        super();
        this.diaChi = diachi;
        this.soNguoi = songuoi;
        this.giaDinh = new ArrayList<>();
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getSoNguoi() {
        return soNguoi;
    }

    public void setSoNguoi(int soNguoi) {
        this.soNguoi = soNguoi;
    }

    public ArrayList<LopNguoi> getGiaDinh() {
        return giaDinh;
    }

    public void setGiaDinh(ArrayList<LopNguoi> giaDinh) {
        this.giaDinh = giaDinh;
    }

    public void add(LopNguoi lopNguoi) {
        giaDinh.add(lopNguoi);
    }

    public void display() {
        for (int i = 0; i < giaDinh.size(); i++) {
            System.out.println(giaDinh.get(i).toString());
        }
        System.out.println(" dia chi "+ diaChi +", so nguoi "+ soNguoi);
    }

    public int findByName(String ten) {
        for (int i = 0; i < giaDinh.size(); i++) {
            if (giaDinh.get(i).getTen().equals(ten)) {
                return i;
            }
        }
        return -1;

    }
    public void edit(String ten,LopNguoi lopNguoi) {
        int indexOfLopnguoi = findByName(ten);
        if(indexOfLopnguoi == -1) {
            System.out.println("không có");
        }else {
            giaDinh.set(indexOfLopnguoi,lopNguoi);
        }
    }
    public void delete(String name) {
        int indexOfLopnguoi = findByName(name);
        if(indexOfLopnguoi == -1) {
            System.out.println("không có");
        }else {
            giaDinh.remove(indexOfLopnguoi);
        }
    }
    public int timKiem(String ten) {
        for (int i = 0; i < giaDinh.size() ; i++) {
            if (giaDinh.get(i).getTen().equals(ten)){
                return i;
            }

        }
        return -1;

    }
    public int timKiemTuoi(int tuoi) {
        for (int i = 0; i < giaDinh.size(); i++) {
            if (giaDinh.get(i).getTuoi() == tuoi) {
                return i;
            }

        }
        return -1;
    }
    public void ageMin(){
        int min= giaDinh.get(0).getTuoi();
        for(int i=0; i<giaDinh.size();i++){
            if(giaDinh.get(i).getTuoi()<min){
                min=giaDinh.get(i).getTuoi();
            }
        }
        System.out.println("thành viên nhỏ tuổi nhất "+ min);
    }



    @Override
    public String toString() {
        return "HoGiaDinh{" +
                "dia chi = " + diaChi +
                ", lop Nguoi = " + giaDinh +
                ",so nguoi = " + soNguoi +
                '}';
    }

    @Override
    public int compareTo(HoGiaDinh o) {
        return this.getSoNguoi()- o.getSoNguoi();
    }
}
