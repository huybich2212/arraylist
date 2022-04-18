package lopnguoi;

import java.util.ArrayList;

public class HoGiaDinh {
    private String diachi;
    private int songuoi;
    private ArrayList<LopNguoi> GiaDinh;

    public HoGiaDinh(String diachi, int songuoi) {
        this.diachi = diachi;
        this.songuoi = songuoi;
        this.GiaDinh = new ArrayList<>();
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public int getSonguoi() {
        return songuoi;
    }

    public void setSonguoi(int songuoi) {
        this.songuoi = songuoi;
    }

    public ArrayList<LopNguoi> getGiaDinh() {
        return GiaDinh;
    }

    public void setGiaDinh(ArrayList<LopNguoi> giaDinh) {
        GiaDinh = giaDinh;
    }

    public void add(LopNguoi lopNguoi) {
        GiaDinh.add(lopNguoi);
    }

    public void display() {
        for (int i = 0; i < GiaDinh.size(); i++) {
            System.out.println(GiaDinh.get(i).toString());
        }
        System.out.println(" dia chi "+diachi +", so nguoi "+songuoi);
    }

    public int findByName(String ten) {
        for (int i = 0; i < GiaDinh.size(); i++) {
            if (GiaDinh.get(i).getTen().equals(ten)) {
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
            GiaDinh.set(indexOfLopnguoi,lopNguoi);
        }
    }
    public void delete(String name) {
        int indexOfLopnguoi = findByName(name);
        if(indexOfLopnguoi == -1) {
            System.out.println("không có");
        }else {
            GiaDinh.remove(indexOfLopnguoi);
        }
    }
    public int timkiem(String ten) {
        for (int i = 0; i < GiaDinh.size() ; i++) {
            if (GiaDinh.get(i).getTen().equals(ten)){
                return i;
            }

        }
        return -1;

    }




    @Override
    public String toString() {
        return "HoGiaDinh{" +
                "dia chi = " + diachi +
                ", lop Nguoi = " + GiaDinh +
                '}';
    }
}
